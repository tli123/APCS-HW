import java.util.*;
import java.io.*;

public class WordSearch {

    private char[][] board;
    private String words = "Wordlist:\n";
    
    public WordSearch(int row, int col) {
	board = new char[row][col];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j] = '.';
	    }
	}
    }

    public WordSearch() {
	this(20, 30);
    }

    public String toString() {	
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public boolean Overflow(String word, int row, int col, String type) {
	if (row < board.length && col < board[0].length) {
	    boolean add = true;
	    if (type.equals("h")) {
		if (col + word.length() > board[0].length) {
		    add = false;
		}
		if (add == true) {
		    for (int i = 0; i < word.length(); i++) {
			if (board[row][col+i] != '.') {
			    add = false;
			    break;
			}
		    }
		}
	    }
	    if (type.equals("v")) {
		if (row + word.length() > board.length) {
		    add = false;
		}
		if (add == true) {
		    for (int i = 0; i < word.length(); i++) {
			if (board[row+i][col] != '.') {
			    add = false;
			    break;
			}
		    }
		}
	    }
	    if (type.equals("rd")) {
		if (row + word.length() > board.length) {
		    add = false;
		}
		if (add == true) {
		    for (int i = 0; i < word.length(); i++) {
			if (board[row+i][col+i] != '.'){
			    add = false;
			    break;
			}
		    }
		}
	    }
	    if (type.equals("ld")) {
		if (row + word.length() > board.length) {
		    add = false;
		}
		for (int i = 0; i < word.length(); i++) {
		    if (board[row-i][col-i] != '.') {
			add = false;
			break;
		    }
		}
	    }
	    return add;
	}
	return false;
    }

    public void Horizontal(String word, int row, int col, char type) {
	boolean add = Overflow(word, row, col, "h");
	if (add == true) {
	    if (type == 'f') {
		Wordlist(word);
	    }
	    for (int i = 0; i < word.length(); i++) {
		board[row][col+i] = word.charAt(i);
	    }
	}
    }

    public void BHorizontal(String word, int row, int col) {
	String w = new StringBuilder(word).reverse().toString();
	Wordlist(word);
	Horizontal(w, row, col, 'b');
    }

    public void Vertical(String word, int row, int col, char type) {
	boolean add = Overflow(word, row, col, "v");
	if (add == true) {
	    if (type == 'f') {
		Wordlist(word);
	    }
	    for (int i = 0; i < word.length(); i++) {
		board[row+i][col] = word.charAt(i);
	    }
	}
    }

    public void BVertical(String word, int row, int col) {
	String w = new StringBuilder(word).reverse().toString();
	Wordlist(word);
	Vertical(w, row, col, 'b');
    }

    public void RDiagonal(String word, int row, int col, char type) {
	boolean add = Overflow(word, row, col, "rd");
	if (add == true) {
	    if (type == 'f') {
		Wordlist(word);
	    }
	    for (int i = 0; i < word.length(); i++) {
		board[row+i][col+i] = word.charAt(i);
	    }
	}
    }

    public void RBDiagonal(String word, int row, int col) {
	String w = new StringBuilder(word).reverse().toString();
	Wordlist(word);
	RDiagonal(w, row, col, 'b');
    }

    public void LDiagonal(String word, int row, int col, char type) {
	boolean add = Overflow(word, row, col, "ld");
	if (add == true) {
	    if (type == 'f') {
		Wordlist(word);
	    }
	    for (int i = 0; i < word.length(); i++) {
		board[row-i][col-i] = word.charAt(i);
	    }
	}
    }

    public void LBDiagonal(String word, int row, int col) {
	String w = new StringBuilder(word).reverse().toString();
	Wordlist(word);
	LDiagonal(w, row, col, 'b');
    }

    public boolean addWord(String w) {
	try {
	    String[] methods = new String[]{"H", "HB", "V", "VB", "RD", "RDB", "LD", "LDB"};
	    Random r = new Random();
	    Random x = new Random();
	    Random y = new Random();
	    String method = methods[r.nextInt(methods.length - 1)];
	    int row = x.nextInt(board.length - 1);
	    int col = y.nextInt(board[0].length - 1);
	    if (method.equals("H")) {
		Horizontal(w, row, col, 'f');
		return true;
	    }
	    if (method.equals("HB")) {
		BHorizontal(w, row, col);
		return true;
	    }
	    if (method.equals("V")) {
		Vertical(w, row, col, 'f');
		return true;
	    }
	    if (method.equals("VB")) {
		BVertical(w, row, col);
		return true;
	    }
	    if (method.equals("RD")) {
		RDiagonal(w, row, col, 'f');
		return true;
	    }
	    if (method.equals("RDB")) {
		RBDiagonal(w, row, col);
		return true;
	    }
	    if (method.equals("LD")) {
		LDiagonal(w, row, col, 'f');
		return true;
	    }
	    if (method.equals("LDB")) {
		LBDiagonal(w, row, col);
		return true;
	    }
	} catch (Exception e) {
	    System.out.println("Error: " + e);
	}
	return false;	
    }

    public void populate() {
	char[] alpha = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	Random r = new Random();
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j < board[i].length; j++) {
		if (board[i][j] == '.') {
		    board[i][j] = alpha[r.nextInt(alpha.length - 1)];
		}
	    }
	}
    }

    public void Wordlist(String w) {
	words = words + w + "\n";
    }

    public String Wordlist() {
	return words;
    }

    public static void main(String args[]) {
	WordSearch w = new WordSearch();
	System.out.println("Before:\n" + w);
	w.Horizontal("hello", 1, 1, 'f');
	w.BHorizontal("look", 1, 7);
	w.Vertical("computer", 1, 6, 'f');
	w.BVertical("laptop", 3, 3);
	w.RDiagonal("word", 6, 8, 'f');
	w.RBDiagonal("science", 9, 10);
	w.LDiagonal("desktop", 20, 20, 'f');
	w.LBDiagonal("orange", 20, 13);
	w.addWord("apple");
	System.out.println("After adding words:\n" + w);
	w.populate();
	System.out.println("Completed puzzle:\n" + w);
	System.out.println(w.Wordlist());
    }
}
