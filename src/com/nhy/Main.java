package com.nhy;

import com.nhy.creature.Monster;
import com.nhy.creature.MonsterOldgodmother;
import com.nhy.creature.Person;


import java.util.HashMap;
import java.util.Scanner;

public class Main {
//    private Room currentRoom;
//    private HashMap<String, Handler> hanlers = new HashMap<String, Handler>();
//
//
//
//    public Main(){
//        hanlers.put("go",new HandlerGo(this));
//        hanlers.put("bye",new HandlerBye(this));
//        hanlers.put("help",new HandlerHelp(this));
////        createRooms();
//    }}

//    private void createRooms() {
//        Room outside, lobby, pub, study, bedroom;
//        //制造房间
//        outside = new Room("城堡外");
//        lobby = new Room("大堂");
//        pub = new Room("小酒吧");
//        study = new Room("书房");
//        bedroom = new Room("卧室");
//
//        //初始化房间的出口
//        outside.setExit("east",lobby);
//        outside.setExit("south",study);
//        outside.setExit("west",pub);
//        lobby.setExit("west",outside);
//        pub.setExit("east",outside);
//        study.setExit("notth",outside);
//        study.setExit("east",bedroom);
//        bedroom.setExit("west",study);
//        lobby.setExit("up",pub);
//        pub.setExit("down",lobby);
//        currentRoom = outside; //从城堡门外开始

    // }
//    private void printWelcome(){
//        System.out.println();
//        System.out.println("欢迎来到城堡！");
//        System.out.println("这是一个超级无聊的游戏");
//        System.out.println("如果需要帮助，请输入’help‘。");
//        System.out.println();
//        showPrompt();
    // }
    //以下为用户命令
//public void play(){
//       Ui.displayIntro();
//
//    Scanner in = new Scanner(System.in);
//    while (true){
//        String command = in.nextLine();
//
//        String[] cmdLineItems = command.split(" ");
//
//        if(cmdLineItems[0].equals("bye"))
//        {
//            Ui.displayBye();
//            System.exit(0);
//
//        }else if(cmdLineItems[0].equals("go")){
//                for(Monster monster :)
//        }
//        else if(cmdLineItems[0].equals("help")){
//           Ui.displayHelpMsg();
//        }else if (cmdLineItems[0].equals("chop")){
//
//            .getPerson().useArticle(this.getPerson().getCurrentWeapon(),
//                    this.getMonsterSet().get(cmdLineItems[1]));
//            Ui.displayDamageMsg(this.getPerson(),this.getMonsterSet().get(cmdLineItems[1]));
//            //妖怪随机砍人
//            for(Monster item:this.getMonsterSet().getMonsters()){
//                if(1== Utils.randomMonsterChop(0,2)){
//
//                    item.useArticle(item.getCurrentWeapon(),this.getPerson());
//                    Ui.displayDamageMsg(item,this.getPerson());
//                }
//                else {
//
//                }
//
//
//            }
//        }
//        else{
//            ui.displayErrorCmdMsg();
//            ui.displayHelpMsg();
//        }
//        ui.displayStaus(this);
//
//    }
//}

    //
//    public void goRoom(String direction){
//        Room nextRoom =currentRoom.getExit(direction);
//
//        if (nextRoom == null){
//            System.out.println("那里没有门！");
//        }
//        else {
//            currentRoom = nextRoom;
//            showPrompt();
//
//        }
//    }
//    public void showPrompt(){
//        System.out.println("你在"+currentRoom);
//        System.out.println("出口有：");
//        System.out.print(currentRoom.getExitDesc());
//        System.out.println();
//    }
////    public void play(){
////        Scanner in = new Scanner(System.in);
////        while (true){
////            String line = in.nextLine();
////            String[] words = line.split(" ");
////            Handler handler = hanlers.get(words[0]);
////            String value = "";
////            if(words.length > 1){
////                value = words[1];
////            }
////            if( handler != null) {
////               handler.doCmd(value);
////               if (handler.isBye())
////                   break;
////            }
////        }
////        in.close();
////    }
    public static void main(String[] args) {
        // write your code here
        Sense sense = new Sense();
        sense.initGame();

        Ui.displayIntro(sense.getPerson());
        Ui.displayReachableRooms(sense.getPerson());
//        Ui.displayStaus(sense);

        Scanner in = new Scanner(System.in);

        while (true) {

            //用户输入命令
            String command = in.nextLine();

            String[] words = command.split(" ");
            sense.judgeWin();
            //根据命令，做相应动作
            if (words[0].equals("help")) {
                Ui.displayHelpMsg();
            } else if (words[0].equals("go")) {
                sense.getPerson().go(words[1]);
                Ui.displayStaus(sense);
                Ui.displayReachableRooms(sense.getPerson());
            } else if (words[0].equals("chop")) {
                sense.getPerson().useArticleMethod(sense.getPerson().getCurrentWeapon(),
                        sense.getMonsterSet().get(words[1]));
                Ui.displayStaus(sense);
                Ui.displayReachableRooms(sense.getPerson());

                Ui.displayDamageMsg(sense.getPerson(),sense.getMonsterSet().get(words[1]));
                //妖怪随机砍人
                for(Monster item2:sense.getMonsterSet().getMonsters()){
                    if(1== Utils.randomMonsterChop(0,2)){

                        item2.useArticleMethod(item2.getCurrentWeapon(),sense.getPerson());
                       Ui.displayDamageMsg(item2,sense.getPerson());
                    }
                    else {

                    }


            } Ui.displayStaus(sense);
            }
            else if (words[0].equals("bye")) {
                Ui.displayBye();
                break;
            } else {
                Ui.displayErrorCmdMsg();
            }


        }
    }
}
