package Danhba;

    public class Lienhe {
        private String tel;
        private String name;
    
        public String gettel(){
        return tel;
    }
    
    public void settel(String tel) {
        this.tel = tel;
    }
    
    public String getname() {
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    
    public Lienhe(){
     
    }
    
    public Lienhe(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public void Inthongtin() {
        System.out.println("Name"+this.name +"\tTel: " +this.tel);
    }
 }
      

