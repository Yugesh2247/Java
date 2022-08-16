class Hawa{
float f;
Hawa(float f){
this.f=f;
}
public void printatt(){
System.out.println(f);
}
public static void main(String[] args){
Hawa h=new Hawa(10);
h.printatt();
}
}