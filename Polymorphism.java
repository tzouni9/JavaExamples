class tell {
    public void tell() {
        System.out.println("!!!!!!!");
    }
}
class one extends tell {
    public void tell() {
        System.out.println("Sample 1 ");
    }
}
class two extends tell {
    public void tell() {
        System.out.println("Sample 2");
        super.tell();
    }
}

class Program {
    public static void main(String args[ ]) {
        tellyou a = new one();
        tellyou b = new two();
        
        a.tell();
        b.tell();
    }
}