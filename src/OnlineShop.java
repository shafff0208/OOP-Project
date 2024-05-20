import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {


        /*
         *Topic Covered: Scanner
         */
        Scanner in= new Scanner (System.in);

        /*
         *Topic Covered: Object Class
         */

        Items i1= new Items ("Spaghetti", 12.5, 5);
        Items i2= new Items ("Lasagna", 16.5, 6);
        Items i3= new Items ("Aglio Olio", 12.5, 7); //Food


        Items i4= new Items ("Water", 0.5, 10);
        Items i5= new Items ("Milo", 3.2, 6);
        Items i6= new Items ("Coffee", 2.8, 8); //Beverage


        Items i7= new Items ("Cake", 8.9, 9);
        Items i8= new Items ("Ice Cream", 3.6, 7);
        Items i9= new Items ("Smoothie", 9.5 , 9); //Dessert


        /*
         *Topic Covered: Array
         */

        String[] Category= {"NULL", "Food", "Beverage", "Dessert"};
        String [] MainOption= {"NULL", "Make Order", "FAQ", "Suggestion & Feedback", "Product Detail"};

        /*
         *INITIALIZATION
         */

        int quantity1=0;
        int quantity2=0;
        int quantity3=0;
        int quantity4=0;
        int quantity5=0;
        int quantity6=0;
        int quantity7=0;
        int quantity8=0;
        int quantity9=0;
        int nostock=0;
        int preorderday;

        double preordertime;
        double deliverycharges=5;

        char foodoption = 0;
        char beverageoption =0;
        char dessertoption=0;
        char categoryoption= 0;
        char mainoption= 0;
        char FAQoption=0;
        char timeslot= 0;
        char productdetail=0;
        char suggestionnfeedback=0;
        char memberresponse=0;


        String paymentmethod;
        String address;
        String promocode;
        String preordermonth;
        String username;
        String passwords;

        String feedback= "";
        String report= "";


        /*
         *Topic Covered: Do While loop, Switch Statement, if else statement
         *INTRO TO ONLINE STORE
         */

        do {
            System.out.println("Welcome to Taylor's Online Food and Beverage Shop! ");
            System.out.println("Please press the letters/numbers corresponding to the options to navigate through the online restaurant");
            System.out.println("(Enlarge the console for a better experience!)");
            System.out.println("-----------------------------------------------");
            System.out.println(" ||MAIN MENU|| ");
            System.out.println("Please choose your option: ");

            /*
             *Topic Covered: For loop
             *LIST OUT ALL Main Option AVAILABLE
             */
            for (int i=1; i<MainOption.length; i++) {
                System.out.println(i + ". " + MainOption[i]);

            }
            System.out.println("5. Exit");
            System.out.println("-----------------------------------------------");
            mainoption= in.next().charAt(0);

            do {

                switch (mainoption) {
                    case '1':
                        System.out.println(" ||MAKE ORDER|| ");
                        System.out.println("Please choose one of the following options: ");
                        System.out.println("a. Foods");
                        System.out.println("b. Beverages");
                        System.out.println("c. Desserts");
                        System.out.println("d. Back to Main Menu");
                        System.out.println("e. Proceed to Checkout");
                        System.out.println("-----------------------------------------------");
                        categoryoption= in.next().charAt(0);


                        switch (categoryoption) {
                            case 'a' :
                                do {
                                    System.out.println(" ||FOODS|| ");
                                    System.out.println("Please choose your food option. ");
                                    System.out.println("a. " + "RM" + i1.getPrice() + " " + i1.getName());
                                    System.out.println("b. " + "RM" + i2.getPrice() + " " + i2.getName());
                                    System.out.println("c. " + "RM" + i3.getPrice() + " " + i3.getName());
                                    System.out.println("-----------------------------------------------");
                                    System.out.println(" ||NAVIGATION|| ");
                                    System.out.println("d. Back to Main Menu");

                                    System.out.println("f. Back to Make Order");
                                    System.out.println("-----------------------------------------------");

                                    /*
                                     *FOOD SWITCH STATEMENT
                                     */


                                    foodoption= in.next().charAt(0);
                                    switch (foodoption) {

                                        /*
                                         *IF QUANTITY>AVAILABLE STOCK, QUANTITY CHOSEN = 0
                                         */

                                        case 'a' :
                                            System.out.println(" [You have chosen " + i1.getName() + "]");
                                            System.out.println("Enter the quantity of your item ");
                                            System.out.println("-----------------------------------------------");
                                            quantity1= in.nextInt()	;
                                            if (quantity1>i1.getStock()) {
                                                quantity1= quantity1 *nostock;
                                                System.out.println("[Sorry we only have  " +i1.getStock() + " " + i1.getName() + " available for now.] ");
                                                System.out.println("-----------------------------------------------");
                                            }
                                            else {
                                                System.out.println("[You have chosen x" + quantity1 + " " + i1.getName()+ "]");
                                                System.out.println("-----------------------------------------------");
                                            }
                                            break;

                                        case 'b' :
                                            System.out.println("[You have chosen " + i2.getName() +"]");
                                            System.out.println("Enter the quantity of your item ");
                                            System.out.println("-----------------------------------------------");
                                            quantity2= in.nextInt()	;
                                            if (quantity2>i2.getStock()) {
                                                quantity2= quantity2 *nostock;
                                                System.out.println("[Sorry we only have  " +i2.getStock() + " " + i2.getName() + " available for now.] ");
                                                System.out.println("-----------------------------------------------");
                                            }
                                            else {
                                                System.out.println("[You have chosen x" + quantity2 + " " + i2.getName()+"]");
                                                System.out.println("-----------------------------------------------");
                                            }

                                            break;

                                        case 'c' :
                                            System.out.println("[You have chosen " + i3.getName()+"]");
                                            System.out.println("Enter the quantity of your item ");
                                            System.out.println("-----------------------------------------------");
                                            quantity3= in.nextInt()	;
                                            if (quantity3>i3.getStock()) {
                                                quantity3= quantity3 *nostock;

                                                System.out.println("[Sorry we only have  " +i3.getStock() + " " + i3.getName() + " available for now.] ");
                                                System.out.println("-----------------------------------------------");
                                            }
                                            else {
                                                System.out.println("[You have chosen x" + quantity3 + " " + i3.getName()+"]");
                                                System.out.println("-----------------------------------------------");
                                            }
                                            break;

                                        //BACK TO MAKE ORDER
                                        case 'f' :

                                            break;

                                        //BACK TO MAIN MENU
                                        case 'd' :

                                            break;

                                        default : System.out.println("Invalid option! Please try again! ");

                                            break;

                                    }



                                }while ( foodoption!='d' && foodoption!='f');

                                /*
                                 *END OF FOOD CATEGORY SWITCH STATEMENT
                                 */

                                break;

                            /*
                             *BEVERAGE CATEGORY SWITCH STATEMENT
                             */

                            case 'b' :
                                do {
                                    System.out.println(" ||BEVERAGE|| ");
                                    System.out.println("Please choose your beverage option. ");
                                    System.out.println("a. " + "RM" + i4.getPrice() + " " + i4.getName());
                                    System.out.println("b. " + "RM" + i5.getPrice() + " " + i5.getName());
                                    System.out.println("c. " + "RM" + i6.getPrice() + " " + i6.getName());
                                    System.out.println("-----------------------------------------------");
                                    System.out.println(" ||NAVIGATION|| ");
                                    System.out.println("d. Back to Main Menu");

                                    System.out.println("f. Back to Make Order");
                                    System.out.println("-----------------------------------------------");
                                    beverageoption= in.next().charAt(0);
                                    switch (beverageoption) {
                                        /*
                                         *IF QUANTITY>AVAILABLE STOCK, QUANTITY CHOSEN = 0
                                         */
                                        case 'a' :
                                            System.out.println("Enter the quantity of your item ");
                                            System.out.println("-----------------------------------------------");
                                            try {
                                                quantity4= in.nextInt()	;
                                                if (quantity4>i4.getStock()) {
                                                    quantity4= quantity4 * nostock;
                                                    System.out.println("[Sorry we only have  " +i4.getStock() + " " + i4.getName() + " available for now.] ");
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                else {
                                                    System.out.println("[You have chosen x" + quantity4 + " " + i4.getName()+"]");
                                                    System.out.println("-----------------------------------------------");
                                                }
                                            }catch (java.util.InputMismatchException e) {
                                                System.out.println("Not a quantity please try again. ");
                                            }
                                            break;

                                        case 'b' :
                                            System.out.println("[You have chosen " + i5.getName()+"]");
                                            System.out.println("Enter the quantity of your item ");
                                            System.out.println("-----------------------------------------------");
                                            try {
                                                quantity5= in.nextInt()	;
                                                if (quantity5>i5.getStock()) {
                                                    quantity5= quantity5 * nostock;
                                                    System.out.println("[Sorry we only have  " +i5.getStock() + " " + i5.getName() + " available for now.] ");
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                else {
                                                    System.out.println("[You have chosen x" + quantity5 + " " + i5.getName()+"]");
                                                    System.out.println("-----------------------------------------------");
                                                }
                                            }catch (java.util.InputMismatchException e) {
                                                System.out.println("Not a quantity please try again. ");
                                            }
                                            break;

                                        case 'c' :
                                            System.out.println("[You have chosen " + i6.getName()+"]");
                                            System.out.println("Enter the quantity of your item ");
                                            System.out.println("-----------------------------------------------");
                                            try {
                                                quantity6= in.nextInt()	;
                                                if (quantity6>i6.getStock()) {
                                                    quantity6= quantity6 * nostock;
                                                    System.out.println("[Sorry we only have  " +i6.getStock() + " " + i6.getName() + " available for now.] ");
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                else {
                                                    System.out.println("[You have chosen x" + quantity6 + " " + i6.getName()+"]");
                                                    System.out.println("-----------------------------------------------");
                                                }
                                            }catch (java.util.InputMismatchException e) {
                                                System.out.println("Not a quantity please try again. ");
                                            }
                                            break;

                                        //BACK TO MAKE ORDER

                                        case 'd' :

                                            break;

                                        //BACK TO MAIN MENU

                                        case 'f' :

                                            break;

                                        default : System.out.println("Invalid option! Please try again! ");

                                            break;

                                    }

                                }while (beverageoption!= 'd' && beverageoption!='f');

                                /*
                                 *END OF BEVERAGE SWITCH STATEMENT
                                 */

                                break;

                            /*
                             *DESSERT SWITCH STATEMENT
                             */

                            case 'c':
                                do {
                                    System.out.println(" ||DESSERT|| ");
                                    System.out.println("Please choose your dessert option. ");
                                    System.out.println("a. " + "RM" + i7.getPrice() + " " + i7.getName());
                                    System.out.println("b. " + "RM" + i8.getPrice() + " " + i8.getName());
                                    System.out.println("c. " + "RM" + i9.getPrice() + " " + i9.getName());
                                    System.out.println("-----------------------------------------------");
                                    System.out.println(" ||NAVIGATION|| ");
                                    System.out.println("d. Back to Main Menu");

                                    System.out.println("f. Back to Make Order");
                                    System.out.println("-----------------------------------------------");
                                    dessertoption= in.next().charAt(0);
                                    switch (dessertoption) {
                                        /*
                                         *IF QUANTITY>AVAILABLE STOCK, QUANTITY CHOSEN = 0
                                         */
                                        case 'a' :
                                            System.out.println("Enter the quantity of your item ");
                                            System.out.println("-----------------------------------------------");
                                            try {
                                                quantity7= in.nextInt()	;

                                                if (quantity7>i7.getStock()) {
                                                    quantity7= quantity7 * nostock;
                                                    System.out.println("[Sorry we only have  " +i7.getStock() + " " + i7.getName() + " available for now.] ");
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                else {
                                                    System.out.println("[You have chosen x" + quantity7 + " " + i7.getName()+"]");
                                                    System.out.println("-----------------------------------------------");
                                                }
                                            }catch (java.util.InputMismatchException e){
                                                System.out.println("Not a quantity please try again. ");
                                            }
                                            break;

                                        case 'b' :
                                            System.out.println("[You have chosen " + i8.getName()+"]");
                                            System.out.println("Enter the quantity of your item ");
                                            System.out.println("-----------------------------------------------");
                                            try {
                                                quantity8= in.nextInt()	;
                                                if (quantity8>i8.getStock()) {
                                                    quantity8= quantity8 * nostock;
                                                    System.out.println("[Sorry we only have  " +i8.getStock() + " " + i8.getName() + " available for now.] ");
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                else {
                                                    System.out.println("[You have chosen x" + quantity8 + " " + i8.getName()+"]");
                                                    System.out.println("-----------------------------------------------");
                                                }
                                            }catch (java.util.InputMismatchException e) {
                                                System.out.println("Not a quantity please try again. ");
                                            }
                                            break;

                                        case 'c' :
                                            System.out.println("[You have chosen " + i9.getName()+"]");
                                            System.out.println("Enter the quantity of your item ");
                                            System.out.println("-----------------------------------------------");
                                            try {
                                                quantity9= in.nextInt()	;
                                                if (quantity9>i9.getStock()) {
                                                    quantity9= quantity9 * nostock;
                                                    System.out.println("[Sorry we only have  " +i9.getStock() + " " + i9.getName() + " available for now.] ");
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                else {
                                                    System.out.println("[You have chosen x" + quantity9 + " " + i9.getName()+"]");
                                                    System.out.println("-----------------------------------------------");
                                                }
                                            }catch(java.util.InputMismatchException e){
                                                System.out.println("Not a quantity please try again. ");
                                            }
                                            break;

                                        //BACK TO MAKE ORDER

                                        case 'd' :

                                            break;

                                        //BACK TO MAIN MENU

                                        case 'f' :

                                            break;

                                        default : System.out.println("Invalid option! Please try again! ");

                                            break;

                                    }

                                }while (dessertoption!= 'f' && dessertoption!= 'd');

                                /*
                                 *END OF DESSERT SWITCH STATEMENT
                                 */

                                break;

                            case 'd':

                                break;

                            //Calculate the total price of all items ordered and list it all out.
                            case 'e':
                                double total3= quantity1 * i1.getPrice() +
                                        quantity2 * i2.getPrice() +
                                        quantity3 * i3.getPrice() +
                                        quantity4 * i4.getPrice() +
                                        quantity5 * i5.getPrice() +
                                        quantity6 * i6.getPrice() +
                                        quantity7 * i7.getPrice() +
                                        quantity8 * i8.getPrice() +
                                        quantity9 * i9.getPrice()

                                        ;
                                double total4= total3 + deliverycharges;

                                System.out.println(" || RECEIPT || ");
                                System.out.println("RM" + i1.getPrice() + " " + i1.getName() + " x" + quantity1);
                                System.out.println("RM" + i2.getPrice() + " " + i2.getName() + " x" + quantity2);
                                System.out.println("RM" + i3.getPrice() + " " + i3.getName() + " x" + quantity3);
                                System.out.println("RM" + i4.getPrice() + " " + i4.getName() + " x" + quantity4);
                                System.out.println("RM" + i5.getPrice() + " " + i5.getName() + " x" + quantity5);
                                System.out.println("RM" + i6.getPrice() + " " + i6.getName() + " x" + quantity6);
                                System.out.println("RM" + i7.getPrice() + " " + i7.getName() + " x" + quantity7);
                                System.out.println("RM" + i8.getPrice() + " " + i8.getName() + " x" + quantity8);
                                System.out.println("RM" + i9.getPrice() + " " + i9.getName() + " x" + quantity9);
                                System.out.println("RM" + i9.getPrice() + " " + i9.getName() + " x" + quantity9);

                                //Will detect if you did not make any order

                                if (total3 == 0) {

                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Have you forgotten to make order? ");
                                    System.out.println("-----------------------------------------------");
                                }

                                else {

                                    //Display total

                                    System.out.println("-----------------------------------------------");
                                    System.out.println("[Your total is RM " + total4 +" including RM 5 delivery charges]");
                                    System.out.println("-----------------------------------------------");

                                    //Won't be able to go back to menu if ordered

                                    System.out.println("Are you sure you want to confirm order? You won't be able to go back to Main Menu");
                                    System.out.println("1. YES");
                                    System.out.println("2. NO");

                                    memberresponse= in.next().charAt(0);
                                    switch (memberresponse) {
                                        case '1':

                                            //Promocode feature
                                            System.out.println("If you have a promo code please enter it below: ");
                                            promocode= in.next();
                                            switch (promocode) {

                                                case "30OFF" :
                                                    System.out.println("-----------------------------------------------");
                                                    System.out.println("You have applied a 30% off coupon on your order! ");
                                                    System.out.println("Your new total is RM"+ total4*70/100);
                                                    System.out.println("-----------------------------------------------");
                                                    break;
                                                case "FREEDEL" :
                                                    System.out.println("-----------------------------------------------");
                                                    System.out.println("You have applied a free delivery voucher on your order!");
                                                    System.out.println("Your new total is RM"+ total3);
                                                    System.out.println("-----------------------------------------------");
                                                    break;
                                            }

                                            //Payment Method feature

                                            System.out.println("Please choose your payment method");
                                            System.out.println("1. TNG E-Wallet ");
                                            System.out.println("2. GrabPay ");
                                            System.out.println("3. ShopeePay ");
                                            System.out.println("4. Debit/ Credit Card ");
                                            System.out.println("5. ApplePay ");
                                            System.out.println("-----------------------------------------------");
                                            paymentmethod= in.next()	;

                                            //Delivery Feature

                                            System.out.println("Please enter your address: ");
                                            address= in.next();
                                            System.out.println("Please choose the time slot for delivery: ");
                                            System.out.println("1. ASAP");
                                            System.out.println("2. Pre-Order ");
                                            timeslot= in.next().charAt(0);
                                            if (timeslot=='1') {
                                                System.out.println("Thanks for ordering with us! Your order will arrive in about 45 mins");
                                                System.out.println("-----------------------------------------------");

                                            }else if (timeslot =='2')
                                            {
                                                System.out.println("Please enter the month of delivery (Eg: January, February etc...) ");
                                                preordermonth= in.next()	;
                                                System.out.println("Please enter the date of delivery (Eg: 10, 25 etc...) ");
                                                preorderday= in.nextInt();
                                                System.out.println("Please enter the time of delivery (Eg: 20.45, 19.25 etc.. 24 Hours format) ");
                                                preordertime= in.nextDouble();
                                                System.out.println("Thanks for ordering with us! We will deliver your order on the " + preorderday + "th of " +
                                                        preordermonth + " at " + preordertime );

                                                System.out.println("-----------------------------------------------");
                                            }
                                            break;

                                        case '2':
                                            break;

                                        default :
                                            break;

                                    }

                                }

                                break;

                            default : System.out.println("Invalid option! Please try again! ");

                                break;

                        }


                        break;


                    //FAQ, choose the frequently asked questions and answer them

                    case '2':
                        do {

                            System.out.println(" ||FAQ|| ");
                            System.out.println("Please choose the following questions: ");
                            System.out.println("1. Are the foods HALAL? ");
                            System.out.println("2. Who are your delivery partners? ");
                            System.out.println("3. How can i contact the online restaurant ");
                            System.out.println("4. Can i get a refund for my order? ");
                            System.out.println("5. What are the benefits of being a member? ");
                            System.out.println("6. What payment method is available for the online restaurant?");
                            System.out.println("7. Back to Main Menu");
                            System.out.println("-----------------------------------------------");
                            FAQoption= in.next().charAt(0);
                            switch (FAQoption) {
                                case '1':
                                    System.out.println("|| Yes! The foods that are offered are all halal certified and can be consumed even for muslims. || ");
                                    System.out.println("-----------------------------------------------");
                                    break;
                                case '2':
                                    System.out.println("|| Foodpanda and GrabFoods are two of our delivery partners. || ");
                                    System.out.println("-----------------------------------------------");
                                    break;
                                case '3' :
                                    System.out.println("|| You may contact us at 1-300-555-444 or email us at taylorsonlinerestaurant@taylors.edu.my || ");
                                    System.out.println("-----------------------------------------------");
                                    break;
                                case '4' :
                                    System.out.println("|| Unfortunately no :( BUT,  we are able to compensate you by offering you a voucher of RM10 fo your next order :)||");
                                    System.out.println("-----------------------------------------------");
                                    break;
                                case '5' :
                                    System.out.println("|| By being a member you are able to redeem points and use it as a discount for your next order. (RM10 = 1 points) || ");
                                    System.out.println("-----------------------------------------------");

                                    break;
                                case '6' :
                                    System.out.println("|| The payment method that is available are as follow: || ");
                                    System.out.println("1. TNG E-Wallet ");
                                    System.out.println("2. GrabPay ");
                                    System.out.println("3. ShopeePay ");
                                    System.out.println("4. Debit/ Credit Card ");
                                    System.out.println("5. ApplePay ");
                                    System.out.println("-----------------------------------------------");

                                    break;
                                case '7' :
                                    break;
                                default: System.out.println("Invalid option! Please try again! ");
                                    break;


                            }


                        }while (FAQoption!= '7');

                        break;

                    //Suggestion and Feedback, take in customer suggestion and store it.

                    case '3':
                        System.out.println(" ||Suggestion & Feedback|| ");
                        System.out.println("Please enter your Full Name: ");
                        username= in.next()	;

                        System.out.println("Please enter your Email: ");
                        passwords= in.next()	;

                        do {

                            System.out.println("Hello " + username + ". Please choose one of the following option: ");
                            System.out.println("1. Suggestion ");
                            System.out.println("2. Feedback ");
                            System.out.println("3. Report a bug ");
                            System.out.println("4. Back to Main Menu ");

                            suggestionnfeedback=in.next().charAt(0);
                            switch (suggestionnfeedback)	{
                                case '1':
                                    System.out.println("Please write down your suggestion for us to improve our online restaurant. ");
                                    String suggestion=in.nextLine();
                                    suggestion=in.nextLine();
                                    System.out.println(" We have received your suggestion. Thank you for your suggestion! We will try our best to improve. ");
                                    System.out.println("   -" + suggestion);
                                    break;
                                case '2':
                                    System.out.println("Please write down your feedback regarding our services.  ");
                                    feedback=in.nextLine();
                                    feedback=in.nextLine();
                                    System.out.println("We have received your feedback. Thank you for your feedback! We will try our best to improve.");
                                    System.out.println("   -" + feedback);
                                    break;
                                case '3':
                                    System.out.println("Plese write down the bug that you have found and we will do our best to fix it. ");
                                    report=in.nextLine();
                                    report=in.nextLine();
                                    System.out.println("We have receoved your report. We are very sorry for the inconvenienced cause, we will fix the problem ASAP. ");
                                    System.out.println("   -" + report);
                                    break;
                                case '4':

                                    break;
                                default:
                                    System.out.println("Invalid option! Please try again! ");
                                    break;

                            }

                        }while (suggestionnfeedback!='4');

                        System.out.println();

                        break;

                    //Product detail, customer is able to read the product detail

                    case '4':
                        do {
                            System.out.println(" ||PRODUCT DETAIL|| ");
                            System.out.println("Please choose one of the following product: ");
                            System.out.println("-----------------------------------------------");
                            System.out.println(" ||FOOD|| ");
                            System.out.println("1. " + i1.getName() + " RM" + i1.getPrice());
                            System.out.println("2. " + i2.getName() + " RM" + i2.getPrice());
                            System.out.println("3. " + i3.getName() + " RM" + i3.getPrice());
                            System.out.println("-----------------------------------------------");
                            System.out.println(" ||BEVERAGE|| ");
                            System.out.println("4. " + i4.getName() + " RM" + i4.getPrice());
                            System.out.println("5. " + i5.getName() + " RM" + i5.getPrice());
                            System.out.println("6. " + i6.getName() + " RM" + i6.getPrice());
                            System.out.println("-----------------------------------------------");
                            System.out.println(" ||DESSERT|| ");
                            System.out.println("7. " + i7.getName() + " RM" + i7.getPrice());
                            System.out.println("8. " + i8.getName() + " RM" + i8.getPrice());
                            System.out.println("9. " + i9.getName() + " RM" + i9.getPrice());
                            System.out.println("-----------------------------------------------");
                            System.out.println("e. Back to Main Menu" );
                            productdetail=in.next().charAt(0);
                            switch (productdetail) {
                                case '1':
                                    System.out.println("-----------------------------------------------");
                                    System.out.println ("Spaghetti is a long, thin, solid, cylindrical pasta. It is a staple food of traditional ");
                                    System.out.println ("Italian cuisine. Like other pasta, spaghetti is made of milled wheat ");
                                    System.out.println ("and water and sometimes enriched with vitamins and minerals.");
                                    System.out.println("-----------------------------------------------");
                                    break;

                                case '2':
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Lasagna is a wide, flat sheet of pasta. ");
                                    System.out.println ("Lasagna can refer to either the type of noodle or to the typical ");
                                    System.out.println ("lasagna dish which is a dish made with several layers of lasagna ");
                                    System.out.println ("sheets with sauce and other ingredients, such as meats and cheese, ");
                                    System.out.println ("in between the lasagna noodles.");
                                    System.out.println("-----------------------------------------------");
                                    break;

                                case '3':
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Aglio e Olio literally means olive oil and garlic in Italian. ");
                                    System.out.println("It is a traditional pasta recipe from Naples. This dish is made by sautéing ");
                                    System.out.println("sliced garlic in olive oil, sometimes with the addition of red pepper flakes, ");
                                    System.out.println ("or anchovies. Add pasta such as spaghetti, linguini, or fettuccine in and toss it well.");
                                    System.out.println("-----------------------------------------------");
                                    break;

                                case '4':
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Just plain water. ");
                                    System.out.println("-----------------------------------------------");
                                    break;


                                case '5':
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Famous malt chocolate beverage amongst southeast asians");
                                    System.out.println("-----------------------------------------------");
                                    break;

                                case '6':
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Made with grinded roasted Arabica coffee beans, suitable to drink on any occasion.");
                                    System.out.println("-----------------------------------------------");
                                    break;
                                case '7':
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("A slice of cake chosen from the cakes below depending on the day that was ordered");
                                    System.out.println("Monday: Cheese Cake ");
                                    System.out.println("Tuesday: Chocolate Cake");
                                    System.out.println("Wednesday: Fruit Cake ");
                                    System.out.println("Thursday: Peppermint Cake");
                                    System.out.println("Friday: Red Velvet Cake");
                                    System.out.println("Saturday: Oreo Cake");
                                    System.out.println("Sunday: Strawberry Cake");
                                    System.out.println("-----------------------------------------------");
                                    break;
                                case '8':
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Icecream that can comfort you during your sad times. Ice cream are also chosen depending on the day that was ordered. ");
                                    System.out.println("Monday: Mango Ice Cream ");
                                    System.out.println("Tuesday: Chocolate Ice Cream");
                                    System.out.println("Wednesday: Red Bean Ice Cream ");
                                    System.out.println("Thursday: Vanilla Ice Cream");
                                    System.out.println("Friday: Strawberry Ice Cream");
                                    System.out.println("Saturday: Oreo Ice Cream");
                                    System.out.println("Sunday: Coconut Ice Cream");
                                    System.out.println("-----------------------------------------------");
                                    break;

                                case '9':
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Very chilling smoothie that can quench your thirst. Chosen depending on the day ordered. ");
                                    System.out.println("Monday: Mango Smoothie ");
                                    System.out.println("Tuesday: Chocolate Smoothie");
                                    System.out.println("Wednesday: Banana Smoothie ");
                                    System.out.println("Thursday: Vanilla Smoothie");
                                    System.out.println("Friday: Strawberry Smoothie");
                                    System.out.println("Saturday: Oreo Smoothie");
                                    System.out.println("Sunday: Coconut Smoothie");
                                    System.out.println("-----------------------------------------------");
                                    break;

                                case 'e':
                                    break;
                                default: System.out.println("Invalid option! Please try again! ");
                                    break;

                            }
                        }while (productdetail!='e');

                        break;

                    //EXIT ONLINE RESTAURANT

                    case '5' : System.out.println("[You have exitted the Online Shop, thank you and come again!]");
                        break;

                    default: System.out.println("Invalid option! Please try again! ");
                        break;

                }

            }while ( mainoption!= '5' && categoryoption!='d' && foodoption!='d' && beverageoption!='d' && dessertoption!='d' &&
                    categoryoption!='e' && productdetail!='e' && FAQoption!='7' && memberresponse!='1' && suggestionnfeedback!='4'  );

            /*
             *END MAKE ORDER SWITCH STATEMENT
             */


        }while (mainoption!='5'&& memberresponse!='1' );

        //END MAIN MENU SWITCH STATEMENT

    }

}

