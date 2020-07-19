package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		System.out.println("1. Birds left on branch: " + remainingNumberOfBirds);
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println("2. Number of Birds: " + numberOfExtraBirds);
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int racoonsInTheWoods = 3;
		int racoonsEatingDinner = 2;
		int remainingRacoons = racoonsInTheWoods - racoonsEatingDinner;
		System.out.println("3. Racoons: " + remainingRacoons);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int totalNumberOfFlowers = 5;
		int totalNumberOfBees = 3;
		int diffFlowerAndBees = totalNumberOfFlowers - totalNumberOfBees;
		System.out.println("4. " + diffFlowerAndBees + " fewer Bees Than Flowers");
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int firstPigeon = 1;
		int secondPigeon = 1;
		int pigeonsEatingBreadCrumbs = firstPigeon + secondPigeon;
		System.out.println("5. Pigeons Eating Crumbs: " + pigeonsEatingBreadCrumbs);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsSittingOnFence = 3;
		int additionalOwls = 2;
		int totalNumberOfOwls = additionalOwls + owlsSittingOnFence;
		System.out.println("6. Owls: " + totalNumberOfOwls);
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorkingOnHome = 2;
		int beaversSwimming = 1;
		int beaversStillWorkingOnHome = beaversWorkingOnHome - beaversSwimming;
		System.out.println("7. Beavers still working: " + beaversStillWorkingOnHome);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSittingInATree = 2;
		int additionalToucans = 1;
		int totalNumberOfToucans = toucansSittingInATree + additionalToucans;
		System.out.println("8. Toucans: " + totalNumberOfToucans);
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int nuts = 2;
		int diffBtwnSquirrelsAndNuts = squirrelsInTree - nuts;
		System.out.println("9. " + diffBtwnSquirrelsAndNuts + " more squirrels than nuts");
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int quarters = (1 * 25); //quarter is 25 cents
		int dimes = (1 * 10); //dime is 10 cents
		int nickels = (2 * 5); //nickel is 5 cents
		int moneyMrsHiltFound = quarters + dimes + nickels;
		System.out.println("10. Money found: " + moneyMrsHiltFound + " Cents");
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int briersMuffins = 18;
		int macAdamsMuffins = 20;
		int flannerysMuffins = 17;
		int muffinsMadeByFirstGrade = briersMuffins + macAdamsMuffins + flannerysMuffins;
		System.out.println("11. Muffins Made by First Grade Class: " + muffinsMadeByFirstGrade);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int costOfYoyoInCents = 24;
		int costOfWhistleInCents = 14;
		int totalCostOfToysInCents = costOfWhistleInCents + costOfYoyoInCents;
		System.out.println("12. Costs of toys: " + totalCostOfToysInCents + " cents");
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int riceKrispieTreats = 5;
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int marshmallowsUsed = largeMarshmallows + miniMarshmallows;
		System.out.println("13. Marshmallows used: " + marshmallowsUsed);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int inchesOfSnowHiltsHouse = 29;
		int inchesofSnowBrecknockSchool = 17;
		int totalInchesOfSnow = inchesofSnowBrecknockSchool + inchesOfSnowHiltsHouse;
		System.out.println("14. Snow: " + totalInchesOfSnow + " inches");
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int hiltsDollars = 10;
		int costOfToyTruck = 3;
		int costOfPencilCase = 2;
		int dollarsLeft = hiltsDollars - (costOfPencilCase + costOfToyTruck);
		System.out.println("15. Hilt's Change: $" + dollarsLeft);
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int joshsMarbles = 16;
		int joshesLostMarbles = 7;
		int joshesLeftoverMarbles = joshsMarbles - joshesLostMarbles;
		System.out.println("16. Marbles left over: " + joshesLeftoverMarbles);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int megansSeashells = 19;
		int goalNumberOfSeashells = 25;
		int seashellsNeededToReachGoal = goalNumberOfSeashells - megansSeashells;
		System.out.println("17. Seashell needed to reach goal: " + seashellsNeededToReachGoal);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradsBalloons = 17;
		int redBalloons = 8;
		int numberOfGreenBalloons = bradsBalloons - redBalloons;
		System.out.println("18. Green Balloons: " + numberOfGreenBalloons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnTheShelf = 38;
		int booksMartaAdded = 10;
		int totalNumberOfBooks = booksMartaAdded + booksOnTheShelf;
		System.out.println("19. Number of Books: " + totalNumberOfBooks);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numberOfLegsPerBee = 6;
		int numberOfBees = 8;
		int legsPer8Bees = numberOfLegsPerBee * numberOfBees;
		System.out.println("20. Number of Legs on 8 bees: " + legsPer8Bees);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costOfIceCreamConeInDollars = 0.99; // cents converted to dollars
		double costOf2Cones = costOfIceCreamConeInDollars * 2;
		System.out.println("21. Cost of 2 Cones: " + costOf2Cones);
		//System.out.println(costOf2Cones);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int hiltsRocks = 64;
		int rocksToCompleteBorder = 125;
		int rocksHiltNeedsToCompleteBorder = rocksToCompleteBorder - hiltsRocks;
		System.out.println("22. Rocks needed to complete border: " + rocksHiltNeedsToCompleteBorder);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltsMarbles = 38;
		int hiltsLostMarbles = 15;
		int hiltsLeftoverMarbles = hiltsMarbles - hiltsLostMarbles;
		System.out.println("23. Hilts Leftover markbles: " + hiltsLeftoverMarbles);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int milesToConcert = 78;
		int milesLeftWhenStoppedForGas = 32;
		int milesLeftAfterStoppingForGas = milesToConcert - milesLeftWhenStoppedForGas;
		System.out.println("24. Remaining distance to destination: " + milesLeftAfterStoppingForGas + " miles");
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		double hoursSpentShovelingSnowSaturdayMorning = 1 + (30 / 60); // 1 hours + 30 minutes divided by total number of minutes in an hours, 60
		double hoursSpentShovelingSnowSaturdayAfternoon = (45 / 60); // 45 minutes divided by total number of minutes in an hours, 60
        double totalhoursSpentShovelingInHours = hoursSpentShovelingSnowSaturdayAfternoon + hoursSpentShovelingSnowSaturdayMorning;
		System.out.println("25. Time Spent Shoveling Snow: " + totalhoursSpentShovelingInHours + " hours");
		/*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int numberOfHotDogs = 6;
		int costOfHotDogInCents = 50;
		double totalCostOfHotDogs = (costOfHotDogInCents*numberOfHotDogs)/100; //50 cents / total number of cents in a dollar, 100 to convert cost into dollars
		System.out.println("26. Cost of Hot Dogs " + totalCostOfHotDogs + " dollars");
		/*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hiltsMoneyInCents = 50;
		int costOfAPencilInCents = 7;
		int numberOfPencilsHiltCanBuy = hiltsMoneyInCents / costOfAPencilInCents; //Using INT rounds down the value to get a whole number. The real answer is a decimal but you can't buy part of a pencil so using INT rounds down to the nearest whole pencil.
		System.out.println("27. Pencils Hilt can buy: " + numberOfPencilsHiltCanBuy);
       /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int numberOfButterFlies = 33; //red and orange make up this total
		int orangeButterflies = 20;
		int redButterFlies = numberOfButterFlies - orangeButterflies;
		System.out.println("28. Number of Red Butterflies: " + redButterFlies);
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double costOfCandyInCents = 54;
		double costOfCAndyInDollars = costOfCandyInCents/100; //convert cents to dollars with cost in cents divided the total number of cents in one dollar
        double dollarsKateGivesClerk = 1;
        double changeDueToKate = (float) dollarsKateGivesClerk - costOfCAndyInDollars;
        System.out.println("29. Change Due: $" + changeDueToKate);
		/*
        30. Mark has 13 trees
         in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int marksTrees = 13;
        int treesAdded = 12;
        int totalNumberOfTrees = marksTrees + treesAdded;
        System.out.println("30. Number of Trees: " + totalNumberOfTrees);
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int daysTillJoySeesGrandma = 2;
        int conversionOfDaysIntoHours = (daysTillJoySeesGrandma * 24); // days multiplied by total number of hours in one day
        System.out.println("31. Hours till Joy sees grandma: " + conversionOfDaysIntoHours);
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int nmbrOfKimsCousins = 4;
        int amntOfGumEachCousinGets = 5;
        int totalAmountOfGum = nmbrOfKimsCousins + amntOfGumEachCousinGets;
        System.out.println("32. Pieces of gum: " +totalAmountOfGum);
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        int dansDollars = 3;
        int costOfCandyBar = 1;
        int changeDuetoDan = dansDollars - costOfCandyBar;
        System.out.println("33. Change due to Dan: " + changeDuetoDan);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int boatsInTheLake = 5;
        int nmbrOfPeoplPerBoat = 3;
        int totalNmbrOfPeople = boatsInTheLake + nmbrOfPeoplPerBoat;
        System.out.println("34. Number of People: " + totalNmbrOfPeople);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int ellensLegos = 380;
        int ellensLostLegos = 57;
        int ellensLeftOverLegos = ellensLegos - ellensLostLegos;
        System.out.println("35. Number of legos left: " + ellensLeftOverLegos);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int aruthursMuffins = 35;
        int goalNmbrOfMuffins = 83;
        int nmbrOfMuffinsNeeded = goalNmbrOfMuffins - aruthursMuffins;
        System.out.println("36. Muffins needed: " + nmbrOfMuffinsNeeded);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int willysCrayons = 1400;
        int lucysCrayons = 290;
        int diffBtwnLucysAndWillysCrayons = willysCrayons - lucysCrayons;
        System.out.println("37. Willy has " + diffBtwnLucysAndWillysCrayons + " more crayons than Lucy.");
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickersOnPage = 10;
        int nmbrOfPages = 22;
        int totalNmbrOfStickers = stickersOnPage * nmbrOfPages;
        System.out.println("38. Stickers: " + totalNmbrOfStickers);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int nmbrOfCupcakes = 96;
        int nmbrOfChildren = 8;
        int nmbrOfCupcakesPerChild = nmbrOfCupcakes / nmbrOfChildren;
        System.out.println("39. Cupcakes per child: " + nmbrOfCupcakesPerChild);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int nmbrOfGingerBreadCookies = 47;
        int nmbrOfCookiesPerJar = 6;
        int nmbrOfCookiesUsed = (nmbrOfGingerBreadCookies / nmbrOfCookiesPerJar) * 6;
        int nmbrOfLeftoverCookies = nmbrOfGingerBreadCookies - nmbrOfCookiesUsed;
        System.out.println("40. Leftover Cookies " + nmbrOfLeftoverCookies);
        //System.out.println(nmbrOfCookiesUsed);
        //System.out.println(nmbrOfLeftoverCookies);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int nmbrOfCroissants = 59;
        int nmbrOfNeighbors = 8;
        int nmbrOfCroissantsGiven = (nmbrOfCroissants / nmbrOfNeighbors) * 8;
        int nmbrOfLeftOverCroissants = nmbrOfCroissants - nmbrOfCroissantsGiven;
        System.out.println("41. Leftover Croissants: " + nmbrOfLeftOverCroissants);
        //System.out.println(nmbrOfCroissantsGiven);
        //System.out.println(nmbrOfLeftOverCroissants);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int nmbrOfOatCookies = 276;
        int nmbrOfOatCookiesPerTray = 12;
        int nmbrOfTraysNeeded = nmbrOfOatCookies / nmbrOfOatCookiesPerTray;
        System.out.println("42. Trays needed: " + nmbrOfTraysNeeded); 
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int nmbrOfMiniPretzels = 480;
        int servingSize = 12;
        int nmbrOfServings = nmbrOfMiniPretzels / servingSize;
        System.out.println("43. Servings Marting Prepared: " + nmbrOfServings);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int lemonCupcakes = 53;
        int lemonCupcakesLeftAtHome = 2;
        int cupcakesPerBox = 3;
        int boxesGiven = (lemonCupcakes - lemonCupcakesLeftAtHome) / cupcakesPerBox;
        System.out.println("44. Boxes of 3 Cupcakes Given: " + boxesGiven);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int carrotSticks = 74;
        int carrotServingSize = 12;
        int uneatenCarrots = carrotSticks - ((carrotSticks / carrotServingSize) * carrotServingSize);
        System.out.println("45. Uneaten Carrots: " + uneatenCarrots);
        //System.out.println(uneatenCarrots);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int teddyBears = 98;
        int shelfLoadOfTeddyBears = 7;
        int shelvesFilled = teddyBears / shelfLoadOfTeddyBears;
        System.out.println("46. Shelves Filled: " + shelvesFilled);
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int nmbrOfPhotos = 480;
        int albumCapacityInPics = 20;
        int nmbrOfAlbumsNeeded = nmbrOfPhotos / albumCapacityInPics;
        System.out.println("47. Albums Needed: " + nmbrOfAlbumsNeeded);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int nmbrOfTradingCards = 94;
        int boxCapacityOfCards = 8;
        int nmbrOfFilledBoxes = nmbrOfTradingCards / boxCapacityOfCards;
        int nmbrOfCardsInUnfilledBox = nmbrOfTradingCards - (nmbrOfFilledBoxes*8);
        System.out.println("48. a) Boxes Filled: " + nmbrOfFilledBoxes + "   b) Cards leftover in unfilled box: " + nmbrOfCardsInUnfilledBox);
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int nmbrOfBooks = 210;
        int nmbrOfShelves = 10;
        int booksPerShelf = nmbrOfBooks / nmbrOfShelves;
        System.out.println("49. Books Per Shelf: " + booksPerShelf);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        int cristinasCroissants = 17;
        int nmbrOfGuests = 7;
        int croissantsPerGuest = cristinasCroissants / nmbrOfGuests;
        System.out.println("50. Coirssants Per Person: " + croissantsPerGuest);
        /*
            CHALLENGE PROBLEMS
        */
        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
        double billsHourlyRate = 1/2.15;
        double jillsHourlyRate = 1/1.90;
        int roomDimensions = ((12 * 14)*4); //dimension are 12 x 14 ft
        double combinedHourlyRate = billsHourlyRate + jillsHourlyRate;
        double hoursToPaint5Rooms = ( (roomDimensions)*5 ) / combinedHourlyRate; //5 is the number of rooms
        int nmbrOfWorkHoursPerDay = 8;
        int nmbrOfRoomsToPaint = 623;
        double nmbrOfRoomsInOneDay = nmbrOfWorkHoursPerDay / combinedHourlyRate;
        double nmbrOfDaysToPaint623Rooms = (nmbrOfRoomsToPaint / nmbrOfRoomsInOneDay);
        
        System.out.println("Challenge #1) Days: " + nmbrOfDaysToPaint623Rooms);
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
        String firstName = "Greyson ";
        String lastName = "Marks, ";
        String middleInitial = "E.";
        String fullName = lastName + firstName + middleInitial;
        System.out.println("Challenge #2) Full Name: " + fullName);
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
        double distanceBtwnNewYorkAndChicago = 800; // distance in miles
        double distanceTraveledByTrain = 537; // distance in miles
        int percentageTraveled = (int) ((distanceTraveledByTrain / distanceBtwnNewYorkAndChicago)*100);
        System.out.println("Challenge #3) Percentage of distance traveled: " + percentageTraveled);
	}

}
