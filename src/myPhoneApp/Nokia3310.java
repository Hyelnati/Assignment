package myPhoneApp;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SELECT A LIST FROM THE MENU: ");
        System.out.println("""
                 ======================
                 1.  PHONE BOOK
                 2.  MESSAGES
                 3.  CHAT
                 4.  CALL REGISTER
                 5.  TONES
                 6.  SETTINGS
                 7.  CALL DIVERT
                 8.  GAMES
                 9.  CALCULATOR
                 10. REMINDER
                 11. CLOCK
                 12. PROFILE
                 13. SIM SERVICES
                 ======================
                 """);
        int number = input.nextInt();
        switch (number){
            case 1 -> {
                System.out.println("Phone Book");
                System.out.println(" 1. Search\n 2. Service Number\n 3. Add name\n 4. Erase\n 5.Edit\n 6. Assign tone\n 7. Send business card\n 8. Options");
                int phoneBook = input.nextInt();
                switch (phoneBook) {
                    case 1 -> System.out.println("search");
                    case 2 -> System.out.println("Service Nos.");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("Send business card");
                    case 8 -> {
                        System.out.println("Options");
                        System.out.println(" 1. Type of view\n 2. Memory status");
                        int option = input.nextInt();
                        switch (option) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                        }
                    }
                }
            }
            case 2 -> {
                System.out.println("Messages");
                System.out.println("""
                         ============================
                         1.  Write messages
                         2.  Inbox
                         3.  Outbox
                         4.  Picture messages
                         5.  Templates
                         6.  Smileys
                         7.  Message settings
                         8.  Information service
                         9.  Voice mailbox number
                         10. Service command editor
                         ============================
                         """);
                int messages = input.nextInt();
                switch (messages){
                    case 1 -> System.out.println("Write messages");

                    case 2 -> System.out.println("Inbox");

                    case 3 -> System.out.println("Outbox");

                    case 4 -> System.out.println("Picture message");

                    case 5 -> System.out.println("Templates");

                    case 6 -> System.out.println("Smileys");

                    case 7 -> {
                        System.out.println("Message settings");
                        System.out.println("1. set\n 2. Common");
                        int messageSettings = input.nextInt();
                        switch (messageSettings){
                            case 1 -> {
                                System.out.println("Set");
                                System.out.println("1. Message center number\n 2. Message sent as\n 3. Message validity");
                                int sent = input.nextInt();
                                switch (sent) {
                                    case 1 -> System.out.println("Message center number");
                                    case 2 -> System.out.println("Message sent as");
                                    case 3 -> System.out.println("Message validity");
                                }
                            }
                            case 2 -> {
                                System.out.println("Common");
                                System.out.println("1. Delivery reports\n 2. Reply via same center\n 3. Character support");
                                int common = input.nextInt();
                                switch (common) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same center");
                                    case 3 -> System.out.println("Character support");
                                }
                            }

                        }
                    }
                    case 8 ->
                        System.out.println("Information service");

                    case 9 ->
                        System.out.println("Voice mailbox number");

                    case 10 ->
                        System.out.println("Service command editor");
                }

            }
            case 3 ->
                System.out.println("Chat");

            case 4 -> {
                System.out.println("Call Register");
                System.out.println("""
                         ==============================
                         1. Missed calls
                         2. Received calls
                         3. Dialled numbers.
                         4. Erase recent call lists
                         5. Show call duration
                         6. Show call costs
                         7. Call cost settings
                         8. Prepaid credit
                         ===============================
                         """);
                int callRegister = input.nextInt();
                switch (callRegister) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    case 5 -> {
                        System.out.println("Show call duration");
                        System.out.println("""
                                 1. Last call duration
                                 2. All calls duration
                                 3. received calls duration
                                 4. Dialled calls duration
                                 5. Clear timers""");
                        int tones = input.nextInt();
                        switch (tones) {
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All calls duration");
                            case 3 -> System.out.println("Received calls duration");
                            case 4 -> System.out.println("Dialled calls duration");
                            case 5 -> System.out.println("Clear timers");
                        }
                    }
                    case 6 -> {
                        System.out.println("Show call cost");
                        System.out.println("""
                                =================
                                1. Last call cost
                                2. All calls cost
                                3. Clear counters
                                =================
                                """);
                        int showCallCost = input.nextInt();
                        switch (showCallCost) {
                            case 1 -> System.out.println("Last call cost");
                            case 2 -> System.out.println("All calls cost");
                            case 3 -> System.out.println("Clear counters");
                            }

                        }
                        case 7 -> {
                            System.out.println("Call cost settings");
                            System.out.println("""
                                    =====================
                                    1. Call cost limit
                                    2. Show costs in call
                                    =====================
                                    """);
                            int callCostSettings = input.nextInt();
                            switch (callCostSettings) {
                                case 1 -> System.out.println("Call cost limit");
                                case 2 -> System.out.println("Show costs in call");
                            }
                        }
                        case 8 -> System.out.println("Prepared cost");
                }
            }
            case 5 -> {
                System.out.println("Tones");
                System.out.println("""
                         ==========================
                         1. Ringing tone
                         2. Ringing volume
                         3. Incoming call alert
                         4. Composer
                         5. Message alert tone
                         6. Keypad tones
                         7. Warning and game tones
                         8. Vibrating alert
                         9. Screen saver
                         ===========================
                         """);
                int tones = input.nextInt();
                switch (tones) {
                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("Composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("Keypad tones");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating alert");
                    case 9 -> System.out.println("Screen saver");
                }

            }
            case 6 -> {
                System.out.println("Settings");
                System.out.println("1. Call settings\n 2. Phone settings\n 3. Security settings\n 4. Restore factory settings");
                int settings = input.nextInt();
                switch (settings){
                    case 1 -> {
                        System.out.println("Call settings");
                        System.out.println("""
                                 ===========================
                                 1. Automatic redial
                                 2. Speed dialing
                                 3. call waiting options
                                 4. Own number sending
                                 5. Phone line in use
                                 6. Automatic answer
                                 ============================
                                 """);
                        int callSettings = input.nextInt();
                        switch (callSettings) {
                            case 1 -> System.out.println("Automatic redial");
                            case 2 -> System.out.println("Speed dialing");
                            case 3 -> System.out.println("Call waiting options");
                            case 4 -> System.out.println("Own number sending");
                            case 5 -> System.out.println("Phone line in use");
                            case 6 -> System.out.println("Automatic answer");
                        }
                    }
                    case 2 -> {
                        System.out.println("Phone settings");
                        System.out.println("""
                                 =================================
                                 1. Language
                                 2. Cell information display
                                 3. Welcome note
                                 4. Network selection
                                 5. Lights
                                 6. Confirm SIM service actions
                                 ==================================
                                 """);
                        int phoneSettings = input.nextInt();
                        switch (phoneSettings) {
                            case 1 -> System.out.println("language");
                            case 2 -> System.out.println("Cell information display");
                            case 3 -> System.out.println("Welcome note");
                            case 4 -> System.out.println("Network selection");
                            case 5 -> System.out.println("Lights");
                            case 6 -> System.out.println("confirm SIM service actions");
                        }
                    }
                    case 3 -> {
                        System.out.println("Security settings");
                        System.out.println("""
                                 ========================
                                 1.PIN code request
                                 2. Call barring service
                                 3. Fixed dialing
                                 4. Closed user group
                                 5. Phone security
                                 6. Change access codes
                                 ========================
                                 """);
                        int securitySettings = input.nextInt();
                        switch (securitySettings) {
                            case 1 -> System.out.println("PIN code request");
                            case 2 -> System.out.println("Call barring service");
                            case 3 -> System.out.println("Fixed dialing");
                            case 4 -> System.out.println("Closed user group");
                            case 5 -> System.out.println("Phone security");
                            case 6 -> System.out.println("Change access codes");

                        }
                    }
                    case 4 ->
                        System.out.println("Restore factory settings");

                }
            }


            case 7 ->
                System.out.println("Call divert");

            case 8 ->
                System.out.println("Games");

            case 9 ->
                System.out.println("Calculator");

            case 10 ->
                System.out.println("Reminder");

            case 11 -> {
                System.out.println("Clock");
                System.out.println("""
                         ===============================
                         1. Alarm clock
                         2. Clock settings
                         3. Date settings
                         4. Stopwatch
                         5. Countdown timer
                         6. Auto update of date and time
                         =================================
                         """);
                int clock = input.nextInt();
                switch (clock) {
                    case 1 -> System.out.println("Alarm clock");
                    case 2 -> System.out.println("Clock settings");
                    case 3 -> System.out.println("Date setting");
                    case 4 -> System.out.println("Stopwatch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");
                }
            }
            case 12 ->
                System.out.println("Profiles");

            case 13 ->
                System.out.println("SIM services");
            default -> System.out.println(" ");

        }
    }
}
