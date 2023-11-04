//Muhammad Gilang Hafizh
// 235150707111011
// TI-A

import java.util.Scanner;

public class KonversiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu:");

            System.out.println("1. Desimal ke Biner");
            System.out.println("2. Biner ke Desimal");
            System.out.println("3. Biner ke Heksadesimal");
            System.out.println("4. Heksadesimal ke Biner");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.println("7. Keluar");
            System.out.println("Masukkan pilihan Anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    desimalKeBiner();
                    break;
                case 2:
                    binerKeDesimal();
                    break;
                case 3:
                    binerKeHexa();
                    break;
                case 4:
                    hexaKeBiner();
                    break;
                case 5:
                    desimalKeHexa();
                    break;
                case 6:
                    hexaKeDesimal();
                    break;
                case 7:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan masukkan pilihan 1-7");
                    System.out.println();
            }
        } while (pilihan != 7);
    }
            public static void desimalKeBiner() {
                Scanner input = new Scanner(System.in);
                System.out.println("Masukkan angka desimal: ");
                int desimal = input.nextInt();
                String biner = Integer.toBinaryString(desimal);
                System.out.println("Nilai biner dari angka desimal " + desimal + " adalah: " + biner);
                System.out.println();
            }

            public static void binerKeDesimal() {
                Scanner input = new Scanner(System.in);
                System.out.println("Masukkan angka biner: ");
                String biner = input.next();
                int desimal = Integer.parseInt(biner, 2);
                System.out.println("Nilai desimal dari angka biner " + biner + " adalah: " + desimal);
                System.out.println();
            }

            public static void binerKeHexa() {
                Scanner input = new Scanner(System.in);
                System.out.println("Masukkan angka biner: ");
                String biner = input.next();
                int desimal = Integer.parseInt(biner, 2);
                String hexadesimal = Integer.toHexString(desimal).toUpperCase();
                System.out.println("Nilai hexadesimal dari angka biner " + biner + " adalah: " + hexadesimal);
                System.out.println();
            }

            public static void hexaKeBiner() {
                Scanner input = new Scanner(System.in);
                System.out.println("Masukkan nilai hexadesimal: ");
                String hexadesimal = input.next();
                int desimal = Integer.parseInt(hexadesimal, 16);
                String biner = Integer.toBinaryString(desimal);
                System.out.println("Nilai biner dari hexadesimal " + hexadesimal + " adalah: " + biner);
                System.out.println();
            }

            public static void desimalKeHexa() {
                Scanner input = new Scanner(System.in);
                System.out.println("Masukkan nilai desimal: ");
                int desimal = input.nextInt();
                String hexadesimal = Integer.toHexString(desimal).toUpperCase();
                System.out.println("Nilai hexadesimal dari angka desimal " + desimal + " adalah: " + hexadesimal);
                System.out.println();
            }

            public static void hexaKeDesimal() {
                Scanner input = new Scanner(System.in);
                System.out.println("Masukkan nilai hexadesimal: ");
                String hexadesimal = input.next();
                int desimal = Integer.parseInt(hexadesimal, 16);
                System.out.println("Nilai desimal dari hexadesimal " + hexadesimal + " adalah: " + desimal);
                System.out.println();
            }
        }
