
public class Exercise1 {

    public static void main(String[] args) {

    }



   //Exercise one


    public String surroundMe(String in, String out) {

        String firstHalf;

        String secondHalf;

        String output;



        if (in == null || out == null || out.length() < 4 || out.length() > 4) {

            output = in;

            return output;

        } else {

            firstHalf= out.substring(0, out.length() / 2);

            secondHalf = out.substring(out.length() / 2);

            output = firstHalf.concat(in);

            output = output.concat(secondHalf);



            return output;

        }

    }



   // Exercise 2

    public String endsMeet(String text, int n) {

        String first;

        String last;

        String output;



        if (text == null || text.length() < 1 || n < 1 || n > text.length() || text.length() > 10) {

            output = text;

            return output;

        } else {

            first = text.substring(0, n);

            last = text.substring(text.length() - 2, text.length());

            output = first.concat(last);



            return output;

        }

    }



   // Exercise 3

    public String middleMan(String text) {

        String first;

        String middle;

        String end;

        double x;

        String output;



        if (text == null || text.length() < 3 || text.length() % 2 == 0) {

            output = text;

            return output;

        }

        else {

            x = Math.ceil(text.length() / 2);

            int y = (int) x;

            middle = text.substring(y, y + 1);

            first = text.substring(y - 1, y);

           end = text.substring(y + 1, y + 2);

            output = first.concat(middle);

            output = output.concat(end);



            return output;

        }

    }



    // exercise 4

    public boolean isCentered(String text, String target) {

        String first;

        String middle;

        String end;

        double n;

        String output;



        if (text == null || target == null || target.length() != 3 || text.length() < 3 || text.length() % 2 == 0) {

            return false;

        }

        else {

            n = Math.ceil(text.length() / 2);

            int l = (int) n;

            middle = text.substring(l, l + 1);

            first = text.substring(l - 1, l);

            end = text.substring(l + 1, l + 2);

            output = first.concat(middle);

            output = output.concat(end);



            return target.equals(end);

        }

    }



    // Exercise 5

    public int countMe(String text, char suffix) {

        String suffixOne = Character.toString(suffix);

        int counter = 0;



        if (text == null || !(Character.isLetter(suffix))) {

            return -1;

        }

        else {

            String [] words;

            words = text.split(" ", 1000);



            for (String word : words) {

                if (word.endsWith(suffixOne)) {

                    counter++;

                }

            }



            return counter;

        }

    }



    // Exercise 6

    public int triplets(String text) {

        String first;

        String second;

        String third;

        int counter = 0;



        if (text == null) {

            return -1;

        } else {

            for (int n = 0; (n + 2) < text.length(); n++) {

                first = text.substring(n, n + 1);

                second = text.substring(n + 1, n + 2);

                third = text.substring(n + 2, n + 3);



                if ((first.equals(second)) && (second.equals(third))) {

                    counter++;

                }

            }



            return counter;

        }



    }



    // Exercise 7
    public long addMe(String text) {

        char character;

        int sum = 0;

        int num;



        if (text == null) {

            return -1;

        } else {

            for (int n = 0; n < text.length(); n++) {

                character = text.charAt(n);



                if (Character.isDigit(character)) {

                    num = Character.getNumericValue(character);

                    sum += num;

                }

            }



            return sum;

        }



    }



    //Exercise 8

    public long sequence(String text) {

        char letter;

        char nextLetter;

        int counter = 1;

        int number = 1;



        if (text == null) {

            return -1;

        } else if (text.isEmpty() || text.isBlank()) {

            return 0;

        } else if (text.length() == 1) {

            return 1;

        } else {

            for (int n = 0; n < text.length(); n++) {

                letter = text.charAt(n);



                if (n + 1 == text.length()) {

                    break;

                } else {

                    nextLetter = text.charAt(n + 1);

                }



                if (letter == nextLetter) {

                    counter++;

                }



                if (counter > number) {

                    number = counter;

                    counter = 1;

                }

            }



            return number;

        }



    }



   // Exercise 9

    public String intertwine(String a, String b) {

        char charOne;

        char charTwo;

        String intertwine = "";

        int n = 0;



        if (a == null || b == null) {

            return null;

        } else {





            if (a.length() > b.length()) {

                for (n = 0; n < a.length(); n++) {

                    if (n != b.length()) {

                        charOne = a.charAt(n);

                        charTwo = b.charAt(n);;



                        intertwine = intertwine + charOne + charTwo;

                    } else {

                        break;

                    }

                }



                for (int j = n; j < a.length(); j++) {

                    charOne = a.charAt(j);

                    intertwine = intertwine + charOne;

                }

            } else if (b.length() > a.length()) {

                for (n = 0; n < b.length(); n++) {

                    if (n != a.length()) {

                        charOne = a.charAt(n);

                        charTwo = b.charAt(n);;



                        intertwine = intertwine + charOne + charTwo;

                    } else {

                        break;

                    }

                }



                for (int j = n; j < b.length(); j++) {

                    charTwo = b.charAt(j);

                    intertwine = intertwine + charTwo;

                }

            } else {

                for (n = 0; n < b.length(); n++) {

                    charOne = a.charAt(n);

                    charTwo = b.charAt(n);;



                    intertwine = intertwine + charOne + charTwo;

                }

            }

            return intertwine;

        }





    }

    // Exercise 10

    public boolean isPalindrome(String text) {

        char charOne;

        char charTwo;

        int n = 0;





        if (text == null) {

            return false;

        } else {

            int j = text.length() - 1;



            while (n < Math.ceil(text.length() / 2) && j > Math.floor(text.length() / 2)) {

                charOne = text.charAt(n);

                charTwo = text.charAt(j);



                if (charOne != charTwo) {

                    return false;

                }



                n++;

                j--;

            }



            return true;

        }

    }

}