package com.nhy;

import com.nhy.article.Weapon;
import com.nhy.article.WeaponGlove;
import com.nhy.article.WeaponKnife;
import com.nhy.creature.Monster;
import com.nhy.creature.MonsterSet;
import com.nhy.creature.Person;


import java.util.Scanner;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/6/4 11:34
 * @version: v1.0
 * @modified By:
 */
public class Sense {

    private Person person = new Person();
    private Monster monsterStinkytofu = new Monster();
    private Monster monsterSufu = new Monster();
    private Monster monsterOldgodmother = new Monster();
    private MonsterSet monsterSet = new MonsterSet();
    private RoomSet roomSet = new RoomSet();
    Ui ui = new Ui();




    public void initGame(){
        initRooms();
        initPerson(roomSet.searchRoomById("r1"));
        initMonster();
    }

    private void initRooms(){

       Room homeBa = new Room("r1","老八家");
       Room toilet = new Room("r2","公厕");
       Room burgerShop = new Room("r3","汉堡店");
       Room homeWang = new Room("r4","王致和家");
       Room island = new Room("r5","葫芦岛");

       homeBa.addReachableRoom("r2",toilet);
       homeBa.addReachableRoom("r3",burgerShop);
       homeBa.addReachableRoom("r4",homeWang);
       homeBa.addReachableRoom("r5",island);

       toilet.addReachableRoom("r1",homeBa);
       toilet.addReachableRoom("r3",burgerShop);
       toilet.addReachableRoom("r5",island);

       burgerShop.addReachableRoom("r1",homeBa);
       burgerShop.addReachableRoom("r2",toilet);
       burgerShop.addReachableRoom("r4",homeWang);

       homeWang.addReachableRoom("r1",homeBa);
       homeWang.addReachableRoom("r5",island);
       homeWang.addReachableRoom("r3",burgerShop);

       island.addReachableRoom("r4",homeWang);
       island.addReachableRoom("r1",homeBa);
       island.addReachableRoom("r2",toilet);

       roomSet.addRoom(homeBa);
       roomSet.addRoom(toilet);
       roomSet.addRoom(burgerShop);
       roomSet.addRoom(homeWang);
       roomSet.addRoom(island);


    }



    public void initPerson(Room room){
        person.setId("8888");
        person.setDescription("老八");
        person.setHPvalue(300);
        person.setCurrentRoom(room);
        person.setCurrentWeapon(new WeaponKnife("pk1","一次性手套",-10));
    }

    public void initMonster(){
        monsterStinkytofu.setId("001");
        monsterStinkytofu.setDescription("臭豆腐怪");
        monsterStinkytofu.setHPvalue(100);
        monsterStinkytofu.setCurrentWeapon(new WeaponGlove("mg1","臭手套",-10));

        monsterSufu.setId("002");
        monsterSufu.setDescription("腐乳魔");
        monsterSufu.setHPvalue(100);
        monsterSufu.setCurrentWeapon(new WeaponGlove("mg2","腐蚀手套",-10));

        monsterOldgodmother.setId("003");
        monsterOldgodmother.setDescription("老干妈精");
        monsterOldgodmother.setHPvalue(100);
        monsterOldgodmother.setCurrentWeapon(new WeaponGlove("mg3","麻辣手套",-10));

        monsterSet.getMonsters().add(monsterStinkytofu);
        monsterSet.getMonsters().add(monsterSufu);
        monsterSet.getMonsters().add(monsterOldgodmother);

    }

    public void judgeWin(){

        if(this.getPerson().getHPvalue() <= 0) {
            System.out.println("老八逝.....");
            System.exit(0);
        }
        if(monsterOldgodmother.getHPvalue()<=0){
            System.out.println("恭喜你，获得老干妈一瓶");
        }
        if(monsterStinkytofu.getHPvalue()<=0){
            System.out.println("恭喜你，获得臭豆腐一瓶");
        }
        if(monsterSufu.getHPvalue()<=0){
            System.out.println("恭喜你，获得腐乳一瓶");
        }
        if(monsterOldgodmother.getHPvalue() <= 0 && monsterSufu.getHPvalue() <=0 && monsterStinkytofu.getHPvalue() <=0){
            System.out.println("恭喜你！成功制作老八秘制小汉堡儿！老八秘制小汉堡儿，即实惠，还管饱！");
            System.exit(0);
        }


    }
//    public void play(){
//        ui.displayIntro(this);
//
//        Scanner in = new Scanner(System.in);
//        while (true){
//            String command = in.nextLine();
//
//            String[] cmdLineItems = command.split(" ");
//
//            if(cmdLineItems[0].equals("bye"))
//            {
//                ui.displayBye();
//                System.exit(0);
//
//            }else if(cmdLineItems[0].equals("go")){
//               // ui.goRoom(cmdLineItems[1]);
//            }
//            else if(cmdLineItems[0].equals("help")){
//                ui.displayHelpMsg();
//            }else if (cmdLineItems[0].equals("chop")){
//
//                this.getPerson().useArticle(this.getPerson().getCurrentWeapon(),
//                        this.getMonsterSet().get(cmdLineItems[1]));
//                ui.displayDamageMsg(this.getPerson(),this.getMonsterSet().get(cmdLineItems[1]));
//                //妖怪随机砍人
//                for(Monster item:this.getMonsterSet().getMonsters()){
//                    if(1== Utils.randomMonsterChop(0,2)){
//
//                        item.useArticle(item.getCurrentWeapon(),this.getPerson());
//                        ui.displayDamageMsg(item,this.getPerson());
//                    }
//                    else {
//
//                    }
//
//
//                }
//            }
//            else{
//                ui.displayErrorCmdMsg();
//                ui.displayHelpMsg();
//            }
//            ui.displayStaus(this);
//
//        }
//    }
   public RoomSet getRoomSet() {
    return roomSet;
}

    public void setRoomSet(RoomSet roomSet) {
        this.roomSet = roomSet;
    }
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public MonsterSet getMonsterSet() {
        return monsterSet;
    }

    public void setMonsterSet(MonsterSet monsterSet) {
        this.monsterSet = monsterSet;
    }

}
