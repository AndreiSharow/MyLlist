package com.MyCompany.homeWork1;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String name;
    private double price;
    private int qty =0;
    private Autor[] autors;

            public Book(String name,Autor[] autors, double price){
            this.name=name;
            this.autors=autors;
            this.price=price;
            }

            public Book(String name, double price, int qty, Autor[] autors) {
                this.name = name;
                this.price = price;
                this.qty = qty;
                this.autors = autors;
            }

            public String getName(){
                return name;
            }

            public Autor[] getAutors(){
                return autors;
            }

            public double getPrice(){
                return price;
            }

            public int getQty(){
                return qty;
            }

            public void setPrice(double price){
                this.price=price;
            }

            public void setQty(int qty){
                this.qty=qty;
            }
            @Override
            public String toString() {
                return "Book{" +
                        "name='" + name + '\''  +
                        ", autors=" + Arrays.toString(autors) +
                        ", price=" + price +
                        ", qty=" + qty+
                        '}';
            }
            public String getAutorName(){
                String  autorsName="";

                for(int i=0; i<autors.length;i++){

                    //checking the last author, do not put a comma
                    if(i==autors.length-1){
                        autorsName+="Avtor:"+autors[i].getName();
                        break;
                    }

                    autorsName+="Avtor:"+autors[i].getName() +", ";

                }

                return autorsName;
            }

    @Override
    public int hashCode() {
        return Objects.hash(this.autors,this.name,this.price,this.qty);
    }

    @Override
    public boolean equals(Object obj) {
                if(obj==null){
                    return false;
                }
                if(this==obj){
                    return true;
                }
                if(obj.getClass()!=this.getClass()){
                    return false;
                }

                Book book=(Book)obj;

        return this.autors.equals(book.autors) && this.qty==book.qty && this.price==book.price && this.name==book.name;
    }
}
