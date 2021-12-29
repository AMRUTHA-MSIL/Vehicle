package com.company;

class Main{
    void run(){System.out.println("Vehicle is running");}
}
class Bike extends Main{
    public static void main(String args[]){

        Bike obj = new Bike();
        obj.run();
    }
}

