mvn –versionimport java.util.Scanner;
public class TestDoor{
    protected boolean isOpen = false;
    public void openDoor(){
        String text = isOpen == false ? "Door open" : "Door already open!";
        if (isOpen == false){
                isOpen = true;
                 System.out.println(text);
                return;
        }
        else{
            System.out.println(text);
            return;
        }
    }
    public void closeDoor(){
        String text = isOpen == true ? "Door closed" : "Door already closed!";
        if (isOpen == true){
                isOpen = false;
                 System.out.println(text);
                return;
        }
        else{
        System.out.println(text);
        return;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DoorWithCodeLock doorwithcodelock = new DoorWithCodeLock();
        while (true){
            int instruct = 0;
            int whetherbreak = 0;
            int userinpt = input.nextInt();
            switch (userinpt){
                case 1:
                    doorwithcodelock.openDoor();
                    break;
                case 2:
                   doorwithcodelock.closeDoor();
                    break;
                case 3:
                    doorwithcodelock.lockDoor();
                    break;
                case 4:
                    doorwithcodelock.unlockDoor();
                    break;
                case 5:
                    whetherbreak = 1;
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
            if (whetherbreak == 1){
                break;
            }

        }

    }

    }
    
class DoorwithLock extends TestDoor{
        boolean isLocked = false;
        @Override
        public void openDoor(){
            if(isOpen == false){
                isLocked = true;
                System.out.println("Door is locked and cannot be opened!");
                return;
            }
            else{
                System.out.println("Door already open!");
                return;
            }
        }
        public void lockDoor(){
            if (isOpen == true){
                System.out.println("Open door cannot be locked!");
                return;
            }
            else{
                if (isLocked == true){
                    System.out.println("Door already locked!");
                    return;
                }
                else{
                    System.out.println("Door locked");
                    isLocked = true;
                    return;
                }
            }
            
        }

        public void unlockDoor(){
            if (isLocked == false){
                System.out.println("Door is not locked!");
                return;
            }
            else{
                System.out.println("Door unlocked");
                isLocked = false;
                return;
            }
            
            
        }
    }

class DoorWithCodeLock extends DoorwithLock{
    int code = 0;
    @Override
    public void lockDoor(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please set the code: ");
    int userinpt = input.nextInt();
    code = userinpt;
    super.lockDoor();
    return;
    }
    @Override
    public void unlockDoor(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the code: ");
        int userinpt = input.nextInt();
        if (userinpt == code){
            super.unlockDoor();
            return;
        }
        else{
            System.out.println("Invalid code!");
            return;
        }
    }

}