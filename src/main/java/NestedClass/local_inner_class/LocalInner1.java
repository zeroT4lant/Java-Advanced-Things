package NestedClass.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math1 = new Math();
        math1.getResult();
    }
}

class Math{
    public void getResult(){



        class Delenie{
            private int delimoe;
            private int delitel;

            public int getChastnoe(){
                return delimoe/delitel;
            }

            public void setChastnoe(int delimoe){
                this.delimoe = delimoe;
            }

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("Delimoe" + delenie.getDelimoe());


    }
}

