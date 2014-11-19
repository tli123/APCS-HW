import java.util.*;


/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{

    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }

    public WordSearch(){
	this(20,30);
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void addWordH(String w,int row, int col){
	if (row <= board.length && col <= board[1].length) {
	    int r = row, c = col;
	    boolean add = true;
	    if (col + w.length() > board[1].length) {
		add = false;
	    }
	    if (add == true) {
		for (int i = 0; i < w.length(); i++) {
		    if (board[r][c+i] != '.') {
			add = false;
			break;
		    }
		}
	    }
	    if (add == true) {
		for (int i=0;i<w.length();i++){
		    board[r][c+i] = w.charAt(i);
		}
	    }
	}
    }

    public void addWordB(String w,int row, int col) {
	String word = new StringBuilder(w).reverse().toString();
	addWordH(word, row, col);
    }

    public void addWordV(String w, int row, int col) {
	if (row <= board.length && col <= board[1].length) {
	    int r = row, c = col;
	    boolean add = true;
	    if (row + w.length() > board.length) {
		add = false;
	    }
	    if (add == true) {
		for (int i = 0; i < w.length(); i++) {
		    if (board[r+i][c] != '.') {
			add = false;
			break;
		    }
		}
	    }
	    if (add == true) {
		for (int i=0;i<w.length();i++){
		    board[r+i][c] = w.charAt(i);
		}
	    }
	}
    }

    public void addWordVB(String w, int row, int col) {
	String word = new StringBuilder(w).reverse().toString();
	addWordV(word, row, col);
    }

    public void addWordDL(String w, int row, int col) {
	if (row <= board.length && col <= board[1].length) {
	    int r = row, c = col;
	    boolean add = true;
	    if (row + w.length() > board.length) {
		add = false;
	    }
	    if (add == true) {
		for (int i = 0; i < w.length(); i++) {
		    if (board[r+i][c+i] != '.') {
			add = false;
			break;
		    }
		}
	    }
	    if (add == true) {
		for (int i=0;i<w.length();i++){
		    board[r+i][c+i] = w.charAt(i);
		}
	    }
	}
    }

    public void addWordDLB(String w, int row, int col) {
	String word = new StringBuilder(w).reverse().toString();
	addWordDL(word, row, col);
    }

    public void addWordDR(String w, int row, int col) {
	if (row <= board.length && col <= board[1].length) {
	    int r = row, c = col;
	    boolean add = true;
	    if (row + w.length() > board.length) {
		add = false;
	    }
	    if (add == true) {
		for (int i = 0; i < w.length(); i++) {
		    if (board[r+i][c-i] != '.') {
			add = false;
			break;
		    }
		}
	    }
	    if (add == true) {
		for (int i=0;i<w.length();i++){
		    board[r+i][c-i] = w.charAt(i);
		}
	    }
	}
    }

    public void addWordDRB(String w, int row, int col) {
	String word = new StringBuilder(w).reverse().toString();
	addWordDR(word, row, col);
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello",3,5);
	w.addWordH("look",3,8);	
	w.addWordB("Edward", 6, 4);
	w.addWordV("AndySucks", 7, 2);
	w.addWordVB("omghai", 7, 3);
	w.addWordDL("lolxd", 3, 15);
	w.addWordDR("rofl", 1, 20);
	System.out.println(w);
    }
}
