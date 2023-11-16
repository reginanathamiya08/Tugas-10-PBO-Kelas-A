public class App {
public static void main(String[] args) {

    //Polymorphism
    Member member1 = new MemberGold();
    Member member2 = new MemberPlatinum();
    Member member3 = new MemberReguler();
    Member member4 = new MemberSilver();

    Integer totalTransaksi1 = member1.hitungTotalBayar(600000);
    Integer totalTransaksi2 = member2.hitungTotalBayar(400000);
    Integer totalTransaksi3 = member3.hitungTotalBayar(7100000);
    Integer totalTransaksi4 = member4.hitungTotalBayar(10000000);

    System.out.println("=============================================================================================");
    System.out.println("");
    System.out.println("Total Bayar Member Gold    : " + totalTransaksi1);
    System.out.println("Total Bayar Member Platinum: " + totalTransaksi2);
    System.out.println("Total Bayar Member Reguler : " + totalTransaksi3);
    System.out.println("Total Bayar Member Silver  : " + totalTransaksi4);
    System.out.println("");
    System.out.println("==============================================================================================");
}   
}