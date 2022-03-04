package Kosullu_İfadeler.Burc_Bulma_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay : ");
        month = scanner.nextInt();

        System.out.print("Doğduğunuz Gün : ");
        day = scanner.nextInt();

        String koc = "Koç Burcu : 21 Mart - 20 Nisan";
        String boga = "Boğa Burcu : 21 Nisan - 20 Mayıs";
        String ikizler = "İkizler Burcu : 21 Mayıs - 21 Haziran";
        String yengec = "Yengeç Burcu : 22 Haziran - 22 Temmuz";
        String aslan = "Aslan Burcu : 23 Temmuz - 22 Ağustos";
        String basak = "Başak Burcu : 23 Ağustos - 22 Eylül";
        String terazi = "Terazi Burcu : 23 Eylül - 23 Ekim";
        String akrep = "Akrep Burcu : 24 Ekim - 22 Kasım";
        String yay = "Yay Burcu : 23 Kasım - 21 Aralık";
        String oglak = "Oğlak Burcu : 22 Aralık - 20 Ocak";
        String kova = "Kova Burcu : 21 Ocak - 18 Şubat";
        String balik = "Balık Burcu : 19 Şubat - 20 Mart";


        if (month==1){
            if (day<=20){
                System.out.println(oglak);
            }else {
                System.out.println(kova);
            }
        }

        if (month==2){
            if (day<=18){
                System.out.println(kova);
            }else {
                System.out.println(balik);
            }
        }

        if (month==3){
            if (day<=20){
                System.out.println(balik);
            }else {
                System.out.println(koc);
            }
        }

        if (month==4){
            if (day<=20){
                System.out.println(koc);
            }else {
                System.out.println(boga);
            }
        }

        if (month==5){
            if (day<=21){
                System.out.println(boga);
            }else {
                System.out.println(ikizler);
            }
        }

        if (month==6){
            if (day<=23){
                System.out.println(ikizler);
            }else {
                System.out.println(yengec);
            }
        }

        if (month==7){
            if (day<=22){
                System.out.println(yengec);
            }else {
                System.out.println(aslan);
            }
        }

        if (month==8){
            if (day<=22){
                System.out.println(aslan);
            }else {
                System.out.println(basak);
            }
        }

        if (month==9){
            if (day<=22){
                System.out.println(basak);
            }else {
                System.out.println(terazi);
            }
        }

        if (month==10){
            if (day<=22){
                System.out.println(terazi);
            }else {
                System.out.println(akrep);
            }
        }

        if (month==11){
            if (day<=22){
                System.out.println(akrep);
            }else {
                System.out.println(yay);
            }
        }


        if (month==12){
            if (day<=21){
                System.out.println(yay);
            }else {
                System.out.println(oglak);
            }
        }

        // İf - Else Kullanarak Burç Bulma

        //Switch Case Kullanarak burç bulma
//        switch (month) {
//            case 1:
//                if (day >= 1 && day <= 31) {
//                    if (day < 22) {
//                        burc = "Oğlak";
//                    } else {
//                        burc = "Kova";
//                    }
//                } else {
//                    isError = true;
//                }
//                break;
//            case 2:
//                if (day >= 1 && day <= 28) {
//                    if (day < 22) {
//                        burc = "Kova";
//                    } else {
//                        burc = "Balık";
//                    }
//                } else {
//                    isError=true;
//                }
//                break;
//            case 3:
//                if (day >= 1 && day <= 31) {
//                    if (day < 21) {
//                        burc = "Balık";
//                    } else {
//                        burc="Koç";
//                    }
//                } else {
//                    isError=true;
//                }
//                break;
//            case 4:
//                if (day >= 1 && day <= 31) {
//                    if (day < 22) {
//                        burc = "Koç";
//                    } else {
//                        burc="Boğa";
//                    }
//                } else {
//                    isError=true;
//                }
//                break;
//            case 5:
//                if (day >= 1 && day <= 31) {
//                    if (day < 22) {
//                        burc="Boğa";
//                    } else {
//                        burc="İkizler";
//                    }
//                } else {
//                    isError=true;
//                }
//                break;
//            case 6:
//                if (day >= 1 && day <= 31) {
//                    if (day < 23) {
//                        burc="İkizler";
//                    } else {
//                        burc="Yengeç";
//                    }
//                } else {
//                    isError=true;
//                }
//                break;
//            case 7:
//                if (day >= 1 && day <= 31) {
//                    if (day < 23) {
//                        burc="Yengeç";
//                    } else {
//                        burc="Aslan";
//                    }
//                } else {
//                    isError=true;
//                }
//                break;
//            case 8:
//                if (day >= 1 && day <= 31) {
//                    if (day < 23) {
//                        burc="Aslan";
//                    } else {
//                        burc="Başak";
//                    }
//                } else {
//                    isError=true;
//                }
//                break;
//            case 9:
//                if (day >= 1 && day <= 31) {
//                    if (day < 23) {
//                        burc="Başak";
//                    } else {
//                        burc="Terazi";
//                    }
//                } else {
//                    isError=true;
//                }
//                break;
//            case 10:
//                if (day >= 1 && day <= 31) {
//                    if (day < 23) {
//                        burc="Terazi";
//                    } else {
//                        burc="Akrep";
//                    }
//                } else {
//                    isError=true;
//                }
//                break;
//            case 11:
//                if (day >= 1 && day <= 31) {
//                    if (day < 22) {
//                        burc="Akrep";
//                    } else {
//                        burc="Yay";
//                    }
//                } else {
//                    isError=true;
//                }
//                break;
//            case 12:
//                if (day >= 1 && day <= 31) {
//                    if (day < 22) {
//                        burc="Yay";
//                    } else {
//                        burc="Oğlak";
//                    }
//                } else {
//                    isError=true;
//                }
//                break;
//
//            default:
//                isError=true;
//        }
//        if (isError){
//            System.out.println("Hatalı giriş yaptınız. Tekrar Deneyiniz.");
//        }else {
//            System.out.println("Burcunuz : "+burc);
//        }
    }
}
