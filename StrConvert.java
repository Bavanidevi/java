lass StrConvert{
  public static void main(String []args){
    String strTest = "100";
    //This statement results in a compilation error as you
    //cannot do arithmetic operation on Strings
    //System.out.println("Using String:" + (strTest/4));
    //Convert the String to Integer
    int iTest = Integer.parseInt(strTest);
    System.out.println("Actual String:"+ strTest);
    System.out.println("Converted to Int:" + iTest);
    //This will now show some arithmetic operation
    System.out.println("Arithmetic Operation on Int:" + (iTest/4));
  }
}
