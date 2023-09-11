import java.util.Scanner;

public class Penilaian {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println( "Penilaian");

        int nilai_1, nilai_2, nilai_3;
        double nilaiutama;

        System.out.println( "Masukan nilai mat:");
        nilai_1=scan.nextInt();

        System.out.println( "Masukan nilai RPL:");
        nilai_2=scan.nextInt();

        System.out.println( "Masukan nilai Bing:");
        nilai_3=scan.nextInt();

        nilaiutama=(nilai_1+ nilai_2+ nilai_3)/3;

        if(nilaiutama >= 96 ) {
            System.out.println( "nilai mu A/ sangat baik");
        }

        else if(nilaiutama >= 91 ) {
            System.out.println( "nilai mu A-/ sangat baik");
        }

        else if(nilaiutama >= 86 ) {
             System.out.println( "nilai mu B+/ Baik");
        }

        else if(nilaiutama >= 81 ) {
             System.out.println( "nilai mu B/ Baik");
        }

        else if(nilaiutama >= 75 ) {
            System.out.println( "nilai mu B-/ Baik");
        }

        else if(nilaiutama >= 70 ) {
             System.out.println( "nilai mu C+/ Cukup");
        }

        else if(nilaiutama >= 65 ) {
             System.out.println( "nilai mu C/ Cukup");
        }
        
        else if(nilaiutama >= 60 ) {
            System.out.println( "nilai mu C-/ Cukup");
        }

        else if(nilaiutama >= 55 ) {
            System.out.println( "nilai mu D+/ Kurang");
        }

        else if(nilaiutama >= 0) {
            System.out.println( "nilai mu D/ Kurang");
        }
        
        

    }
}
