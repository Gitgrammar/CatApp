import java.util.*;

/**
 * Cat
 */
public class Cat {
    String[]color;
    String name;
    int intimacy;
    ArrayList<String>list=new ArrayList();
    public Cat(String[]color,String name,int intimacy,ArrayList<String>list){
        this.color=color;
        this.name=" ";
        this.intimacy=0;
        this.list=list;
    }
    void addIntimacy(){
    this.intimacy++;
    }
    
       void showInfo(){
        
        
        ArrayList<String>list=new ArrayList(); 
        while(true){

          System.out.println("***猫集め***");
          System.out.println("1.集める 2.遊ぶ 3.終了>>2");
        Scanner sc=new Scanner(System.in);
        int select=sc.nextInt();

        switch(select){
          case 1:
          String[]color={"白","赤","茶トラ"};
        Random rand=new Random();
        int num=rand.nextInt(2)+1;
        String catColor=color[num];

        System.out.println(catColor+"猫を見つけた");
        System.out.println("名前をつけてください。>>");
        String name=sc.next();
        System.out.print(name+"が仲間に加わった。");
   
        list.add(name+catColor+this.intimacy);
        System.out.println(list);
        continue;

          case 2:
          if(list.size()>0){
            
            System.out.println("今いる仲間は");
            for(int i=0;i<list.size();i++){
              System.out.println(i+"・・・"+list.get(i));
            }
            System.out.println("どの猫と遊びますか？");
            int catIndex=sc.nextInt();
            System.out.println(list.get(catIndex)+"と遊んだ");
            addIntimacy();
            System.out.println(list.get(catIndex)+"との親密度が上がった。");
           }
          else { System.out.println("まだ遊ぶねこがいません。");
          }
            continue;
          
          case 3:
          
          System.out.println("また遊んでね。おしまい");
          break;
        }
        break;
        
        }
        
        }
        
    }


    

    
    