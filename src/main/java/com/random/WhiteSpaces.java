package com.random;

public class WhiteSpaces {

    public static void main(String[] args) {
        //int i;
        String stringWithoutSpaces = "";
        String x="my    Ram";
        char charArray[]=x.toCharArray();
      for(int i=0;i<charArray.length;i++) {
          if ( (charArray[i] != ' ') )
          {
              stringWithoutSpaces = stringWithoutSpaces + charArray[i];
          }
      }
        System.out.println(stringWithoutSpaces);
    }
}
