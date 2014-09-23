//1. firstHalf

public String firstHalf(String str) {
  return str.substring(0, str.length()/2);
}

//2. mixstart

public boolean mixStart(String str) {
  return (str.indexOf("ix") >= 0);
}

//3. makeOutWord

public String makeOutWord(String out, String word) {
  String b = out.substring(0, 2);
  String e = out.substring(2);
  return b + word + e;
}
