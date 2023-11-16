public class MemberPlatinum extends Member implements CanRequestDelivery, CanRequestCicilan, CanDeposit {

    @Override
    public Integer hitungTotalBayar(Integer totalBayar) {
        if (totalBayar >= 500000 && totalBayar <= 1000000){
            totalBayar -=  totalBayar * 3/100;
            this.totalBayar = totalBayar;
        }
        else if (totalBayar > 1000000 && totalBayar <= 7000000){
            totalBayar -= totalBayar * 5/100;
            this.totalBayar = totalBayar;
        }
        else if (totalBayar > 7000000 && totalBayar <= 10000000){
            totalBayar -= totalBayar * 7/100 - 1;
            this.totalBayar = totalBayar;
        }
        else if (totalBayar > 10000000){
            totalBayar -= totalBayar * 7/100;
            this.totalBayar = totalBayar;
        }
        
        this.totalBayar = totalBayar;
        return this.totalBayar;
    }

    @Override
    public Integer hitungOngkir(Double jarakTujuan) {
        Integer hargaOngkir = 0;
        if (jarakTujuan >= 10.0){
            for (Integer i = 10; i < jarakTujuan; i++){
                hargaOngkir += 1000;
            }
        }
        return hargaOngkir;
    }

    @Override
    public Integer deposit(Integer jumlahDeposit) {
        return this.saldo = jumlahDeposit;
    }

    @Override
    public Integer tarikTunai(Integer jumlahTarikTunai) {
        if (jumlahTarikTunai > this.saldo){
            System.out.println("Saldo anda tidak mencukupi !!");
        }
        else if ( jumlahTarikTunai <= this.saldo){
            this.saldo -= jumlahTarikTunai;
        }
        return jumlahTarikTunai;
    }

    @Override
    public Integer hitungCicilanPerBulan(Integer totalBelanja, Integer jumlahBulan) {
      
        throw new UnsupportedOperationException("Unimplemented method 'hitungCicilanPerBulan'");
    }

    @Override
    public Integer getSaldo() {
        throw new UnsupportedOperationException("Unimplemented method 'getSaldo'");
    }

 
}
