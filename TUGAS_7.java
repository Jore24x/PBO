import java.util.Scanner;

//jam kerja normal 173 jam
//jam lembur 20.000/jam
//
class golongan {
    Scanner sc = new Scanner(System.in);

    private int jam, jamN = 173 , lembur;
    private long gol, tun  , totgol , tottun;


    public void golongan1() {
        gol = 1486500;
        tun = 250000;
        System.out.println("Golongan yang anda pilih golongan 1");
        System.out.println("jumlah jam kerja anda? : ");
        jam = sc.nextInt();
        if (jam - jamN == 0) {
            totgol = gol - (gol*5/1000); tottun = tun - (gol*5/1000);
            System.out.println("Gaji anda sebesar: Rp." + totgol);
            System.out.println("Tunjangan anda sebesar: Rp. " + tottun);
        } else if (jam - jamN >= 0) {
            lembur = jam - jamN;
            jam=(jam-jamN)*20000;
            gol = gol + jam;
            totgol = gol - (gol*5/1000); tottun = tun - (gol*5/1000);
            System.out.println("jam lembur anda: " + lembur);
            System.out.println("Gaji anda sebesar: Rp." + totgol);
            System.out.println("Tunjangan anda sebesar: Rp. " + tottun);
        } else if (jam - jamN <= 0) {
            System.out.println("Anda tidak dapet gaji!!!");
        } else {
            System.out.println("salah input mas!!!");
            golongan1();
        }
    }
    public void golongan2(){
        gol=1926000; tun=300000;
        System.out.println("Golongan yang anda pilih golongan 2");
        System.out.println("jumlah jam kerja anda? : ");
        jam= sc.nextInt();
        if (jam-jamN==0){
            totgol = gol - (gol*5/1000); tottun = tun - (gol*5/1000);
            System.out.println("Gaji anda sebesar: Rp." + totgol);
            System.out.println("Tunjangan anda sebesar: Rp. " + tottun);
        }
        else if (jam-jamN>=0) {
            lembur = jam - jamN;
            jam=(jam-jamN)*20000;
            gol=gol+jam;
            totgol = gol - (gol*5/1000); tottun = tun - (gol*5/1000);
            System.out.println("jam lembur anda: " + lembur);
            System.out.println("Gaji anda sebesar: Rp." + totgol);
            System.out.println("Tunjangan anda sebesar: Rp. " + tottun);
        }
        else if (jam-jamN<=0){
            System.out.println("Anda tidak dapet gaji!!!");
        }
        else {
            System.out.println("salah input mas!!!");
            golongan2();
        }


    }
    public void golongan3(){
        gol=2456700; tun=350000;
        System.out.println("Golongan yang anda pilih golongan 3");
        System.out.println("jumlah jam kerja anda? : ");
        jam= sc.nextInt();
        if (jam-jamN==0){
            totgol = gol - (gol*5/1000); tottun = tun - (gol*5/1000);
            System.out.println("Gaji anda sebesar: Rp." + totgol);
            System.out.println("Tunjangan anda sebesar: Rp. " + tottun);
        }
        else if (jam-jamN>=0) {
            lembur = jam - jamN;
            jam=(jam-jamN)*20000;
            gol=gol+jam;
            totgol = gol - (gol*5/1000); tottun = tun - (gol*5/1000);
            System.out.println("jam lembur anda: " + lembur);
            System.out.println("Gaji anda sebesar: Rp." + totgol);
            System.out.println("Tunjangan anda sebesar: Rp. " + tottun);
        }
        else if (jam-jamN<=0){
            System.out.println("Anda tidak dapet gaji!!!");
        }
        else {
            System.out.println("salah input mas!!!");
            golongan3();
        }

    }
    public void golongan4(){
        gol=2899500; tun=400000;
        System.out.println("Golongan yang anda pilih golongan 4");
        System.out.println("jumlah jam kerja anda? : ");
        jam= sc.nextInt();
        if (jam-jamN==0){
            totgol = gol - (gol*5/1000); tottun = tun - (gol*5/1000);
            System.out.println("Gaji anda sebesar: Rp." + totgol);
            System.out.println("Tunjangan anda sebesar: Rp. " + tottun);
        }
        else if (jam-jamN>=0) {
            lembur = jam - jamN;
            jam=(jam-jamN)*20000;
            gol=gol+jam;
            totgol = gol - (gol*5/1000); tottun = tun - (gol*5/1000);
            System.out.println("jam lembur anda: " + lembur);
            System.out.println("Gaji anda sebesar: Rp." + totgol);
            System.out.println("Tunjangan anda sebesar: Rp. " + tottun);
        }
        else if (jam-jamN<=0){
            System.out.println("Anda tidak dapet gaji!!!");
        }
        else {
            System.out.println("salah input mas!!!");
            golongan4();
        }

    }
}

        class pilgolongan{
            Scanner sc = new Scanner(System.in);
            private byte pil;
           golongan gol = new golongan();


            public void pilihgol() {
                System.out.println("GOLONGAN\t\t  GAJI POKOK\t\tTUNJANGAN");
                System.out.println("\t1\t\t\tRp. 1.486.500\t\tRp. 250.000");
                System.out.println("\t2\t\t\tRp. 1.926.000\t\tRp. 300.000");
                System.out.println("\t3\t\t\tRp. 2.456.700\t\tRp. 350.000");
                System.out.println("\t4\t\t\tRp. 2.899.500\t\tRp. 400.000");

                System.out.print("Pilih golongan: ");
                pil = sc.nextByte();
                switch (pil) {
                    case 1:
                        gol.golongan1();
                }
                switch (pil) {
                    case 2:
                        gol.golongan2();
                }
                switch (pil) {
                    case 3:
                        gol.golongan3();
                }
                switch (pil) {
                    case 4:
                        gol.golongan4();
                }


            }


        }

        public class TUGAS_7 {
            public static void main(String[] args) {
                pilgolongan gol = new pilgolongan();
                gol.pilihgol();
            }
        }

