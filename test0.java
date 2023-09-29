class test0{
    public static void main (String []args){
       test0 t1=new test0();
       t1.m1();

    }
    void m1(){
        System.out.println("method m1 executed");
        m1();
    }
}