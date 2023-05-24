package myPhoneApp;

import java.util.Scanner;

public class Nokia3310Refactored {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }
    private static void mainMenu(){
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
                0.  EXIT
                ======================
                """);
        int mainMenu = input.nextInt();
        switch (mainMenu){
            case 1  ->  phoneBook();
            case 2  ->  messages();
            case 3  ->  chat();
            case 4  ->  callRegister();
            case 5  ->  tones();
            case 6  ->  settings();
            case 7  ->  callDivert();
            case 8  ->  games();
            case 9  ->  calculator();
            case 10 ->  reminder();
            case 11 ->  clock();
            case 12 ->  profile();
            case 13 ->  simServices();
            case 0  ->  exitNow();

        }

    }
    private static void phoneBook(){
        System.out.println("Phone book");
        System.out.println("""
                    ======================
                    1. Search
                    2. Service Number
                    3. Add name
                    4. Erase
                    5. Edit
                    6. Assign tone
                    7. Send business card
                    8. Options
                    0. Back to main menu
                    ======================
                    """);
        int phoneBook = input.nextInt();
        switch (phoneBook) {
            case 1 -> System.out.println("Search");
            case 2 -> System.out.println("Service number");
            case 3 -> System.out.println("Add name");
            case 4 -> System.out.println("Erase");
            case 5 -> System.out.println("Edit");
            case 6 -> System.out.println("Assign tone");
            case 7 -> System.out.println("Send business card");
            case 8 -> {
                System.out.println("Options");
                System.out.println("""
                        =================
                        1. Type of view;
                        2. Memory status
                        3. back
                        =================""");
                int options = input.nextInt();
                switch (options){
                    case 1 -> System.out.println("Type of view");
                    case 2 -> System.out.println("Memory status");
                    case 3 -> phoneBook();
                }
            }
            case 0 -> {
                System.out.println("Go back");
                backToMainMenu();
                exitNow();
            }
        }
        }
    private static void messages(){
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
                 11. Back to main menu
                 0.  Exit now
                 ============================
                         """);
        int messages = input.nextInt();
        switch (messages){
                case 1  -> System.out.println("Write messages");
                case 2  -> System.out.println("Inbox");
                case 3  -> System.out.println("Outbox");
                case 4  -> System.out.println("Picture messages");
                case 5  -> System.out.println("Templates");
                case 6  -> System.out.println("Smileys");
                case 7  -> {
                    System.out.println("Message settings");
                    System.out.println("""
                            ==========
                            1. Set
                            2. Common
                            3. Back
                            ==========
                            """);
                    int messageSettings = input.nextInt();
                    switch (messageSettings){
                        case 1 -> {
                            System.out.println("Set");
                            System.out.println("""
                                    ========================
                                    1. Message center number
                                    2. Message sent as
                                    3. Message validity
                                    4. Back
                                    ========================
                                    """);
                            int set = input.nextInt();
                            switch (set){
                                case 1 -> System.out.println("Message center number");
                                case 2 -> System.out.println("Message sent as");
                                case 3 -> System.out.println("Message validity");
                                case 4 -> messages();
                            }
                        }
                        case 2 -> {
                            System.out.println("Common");
                            System.out.println("""
                                    ========================
                                    1. Delivery reports
                                    2. Reply via same center
                                    3. Character support
                                    4. Back
                                    ========================
                                    """);
                            int common = input.nextInt();
                            switch (common){
                                case 1 -> System.out.println("Delivery reports");
                                case 2 -> System.out.println("Reply via same center");
                                case 3 -> System.out.println("Character support");
                                case 4 -> messages();
                            }
                        }
                        case 3 -> messages();
                    }

                }
                case 8  -> System.out.println("Information service");
                case 9  -> System.out.println("Voice mailbox number");
                case 10 -> System.out.println("Service command editor");
                case 11  ->{
                    System.out.println("Back to main menu");
                    backToMainMenu();
                }
                case 0 -> exitNow();
        }

    }
    private static void chat(){
        System.out.println("Chat");
        System.out.println("""
                ====================
                1. Chat
                2. Back to main menu
                3. Exit Now
                ====================
                """);
        int chat = input.nextInt();
        switch (chat){
            case 1 -> System.out.println("Chat");
            case 2 -> backToMainMenu();
            case 3 -> exitNow();
        }
    }
    private static void callRegister(){
        System.out.println("Call register");
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
                9. Back to main menu
                0. Exit
                ===============================""");
        int callRegister = input.nextInt();
        switch (callRegister){
            case 1 -> System.out.println("Missed calls");
            case 2 -> System.out.println("Received calls");
            case 3 -> System.out.println("Dialled numbers");
            case 4 -> System.out.println("Erase recent call lists");
            case 5 -> {
                System.out.println("Show call costs");
                System.out.println("""
                           ==========================
                           1. Last call duration
                           2. All calls duration
                           3. received calls duration
                           4. Dialled calls duration
                           5. Clear timers
                           6. Back
                           ===========================
                           """);
                int showCallDuration = input.nextInt();
                switch (showCallDuration){
                    case 1 -> System.out.println("Last call duration");
                    case 2 -> System.out.println("All calls duration");
                    case 3 -> System.out.println("Received calls duration");
                    case 4 -> System.out.println("Dialled calls duration");
                    case 5 -> System.out.println("Clear timers");
                    case 6 -> callRegister();
                }
            }
            case 6 -> {
                System.out.println("Show call cost");
                System.out.println("""
                           =================
                           1. Last call cost
                           2. All calls cost
                           3. Clear counters
                           4. Back
                           =================
                           """);
                int showCallCost = input.nextInt();
                switch (showCallCost) {
                    case 1 -> System.out.println("Last call cost");
                    case 2 -> System.out.println("All calls cost");
                    case 3 -> System.out.println("Clear counters");
                    case 4 -> callRegister();
                }
            }
            case 7 ->{
                System.out.println("Call cost settings");
                System.out.println("""
                           =====================
                           1. Call cost limit
                           2. Show costs in call
                           3. Back
                           =====================
                           """);
                int callCostSettings = input.nextInt();
                switch (callCostSettings) {
                    case 1 -> System.out.println("Call cost limit");
                    case 2 -> System.out.println("Show costs in call");
                    case 3 -> callRegister();
                }
            }
            case 8 -> System.out.println("Prepaid credit");
            case 9 -> backToMainMenu();
            case 0 -> exitNow();
            }

        }
        private static void tones(){
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
                    10.Back to main menu
                    0. Exit now
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
                case 10-> backToMainMenu();
                case 0 -> exitNow();
            }
    }
    private static void settings(){
        System.out.println("Settings");
        System.out.println("""
                ===========================
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factory settings
                5. Back to main menu
                0. Exit
                =============================
                """);
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
                           7. Back
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
                    case 7 -> settings();
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
                           7. Back
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
                    case 7 -> settings();
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
                           7. Back
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
                    case 7 -> backToMainMenu();
                }
            }
            case 4 -> System.out.println("Restore factory settings");
            case 5 -> backToMainMenu();
            case 0 -> exitNow();
        }
    }
    private static void callDivert(){
        System.out.println("Call Divert");
        System.out.println("""
                ====================
                1. Call divert
                2. Back to main menu
                3. Exit
                =====================
                """);
        int callDivert = input.nextInt();
        switch (callDivert){
            case 1 -> System.out.println("Call divert");
            case 2 -> backToMainMenu();
            case 3 -> exitNow();
        }
    }
    private static void games(){
        System.out.println("Games");
        System.out.println("""
                ====================
                1. Games
                2. Back to main menu
                3. Exit
                =====================
                """);
        int games = input.nextInt();
        switch (games) {
            case 1 -> System.out.println("Games");
            case 2 -> backToMainMenu();
            case 3 -> exitNow();
        }
    }
    private static void calculator(){
        System.out.println("Calculator");
        System.out.println("""
                ====================
                1. Calculator
                2. Back to main menu
                3. Exit
                =====================
                """);
        int calculator = input.nextInt();
        switch (calculator){
            case 1 -> System.out.println("Calculator");
            case 2 -> backToMainMenu();
            case 3 -> exitNow();
        }
    }
    private static void reminder(){
        System.out.println("Reminder");
        System.out.println("""
                ====================
                1. Reminder
                2. Back to main menu
                3. Exit
                =====================
                """);
        int reminder = input.nextInt();
        switch (reminder){
            case 1 -> System.out.println("Reminder");
            case 2 -> backToMainMenu();
            case 3 -> exitNow();
        }
    }
    private static void clock(){
        System.out.println("Clock");
        System.out.println("""
                ===============================
                1. Alarm clock
                2. Clock settings
                3. Date settings
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
                7. Back to main menu
                0. Exit
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
            case 7 -> backToMainMenu();
            case 0 -> exitNow();
        }
    }
    private static void profile(){
        System.out.println("Profile");
        System.out.println("""
                ====================
                1. Profile
                2. Back to main menu
                3. Exit
                =====================
                """);
        int profile = input.nextInt();
        switch (profile){
            case 1 -> System.out.println("Profile");
            case 2 -> backToMainMenu();
            case 3 -> exitNow();
        }
    }
    private static void simServices(){
        System.out.println("SIM Services");
        System.out.println("""
                ====================
                1. SIM Services
                2. Back to main menu
                3. Exit
                =====================
                """);
        int simServices = input.nextInt();
        switch (simServices){
            case 1 -> System.out.println("SIM Services");
            case 2 -> backToMainMenu();
            case 3 -> exitNow();
        }

    }
    private static void backToMainMenu(){
        mainMenu();

    }
    private static void exitNow(){
        System.exit(1);
    }

        }











