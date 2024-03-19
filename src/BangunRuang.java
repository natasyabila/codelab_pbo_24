public class BangunRuang {
    private String name;

    BangunRuang(){
    }

    public BangunRuang(String namaBangun) {
        this.name = namaBangun;
    }

    public void inputNilai(){
        System.out.println("Input nilai");
    }

    public void luasPermukaan(){
        System.out.println();
    }

    public void volume(){
        System.out.println("Menghitung volume bangun " + name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String returnName(){
        return name;
    }
}
