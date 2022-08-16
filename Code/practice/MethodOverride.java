class help{
     void  run(){
        System.out.println("Running");
    }
}
    class MethodOverride extends help{
         void run(){
            System.out.println("its running");
        }
        public static void main(String[] args) {
            MethodOverride obj=new MethodOverride();
               obj.run(); 
               
            }
        
    }