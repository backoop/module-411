package ch.fwesterath;

import ch.fwesterath.model.Human;
import ch.fwesterath.model.Person;
import ch.fwesterath.model.PersonHeightComperator;
import ch.fwesterath.model.PersonComparator;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        Person[] persons = new Person[100];
        persons[0] = new Person("Zenia",  "Estes", 1.82, 37, 37);
        persons[1] = new Person("Tatyana",  "Ramirez", 1.65, 37, 40);
        persons[2] = new Person("Abbot",  "Burris", 1.82, 38, 38);
        persons[3] = new Person("Keaton",  "Riddle", 1.53, 43, 29);
        persons[4] = new Person("Dorian",  "Rasmussen", 1.57, 38, 28);
        persons[5] = new Person("Kylee",  "Boyd", 1.66, 41, 27);
        persons[6] = new Person("Ferdinand",  "Hernandez", 1.82, 44, 30);
        persons[7] = new Person("Jorden",  "Gamble", 1.68, 37, 23);
        persons[8] = new Person("Evelyn",  "Pugh", 1.55, 41, 20);
        persons[9] = new Person("Tamara",  "Bradshaw", 1.63, 42, 30);
        persons[10] = new Person("Ezekiel",  "Morrow", 1.55, 41, 25);
        persons[11] = new Person("Sara",  "Warner", 1.8, 40, 36);
        persons[12] = new Person("Driscoll",  "Burch", 1.74, 35, 23);
        persons[13] = new Person("Charissa",  "Fulton", 1.91, 42, 28);
        persons[14] = new Person("Abbot",  "Tyson", 1.52, 41, 23);
        persons[15] = new Person("Warren",  "Holmes", 1.86, 42, 21);
        persons[16] = new Person("Aladdin",  "Meyer", 1.76, 42, 34);
        persons[17] = new Person("Geoffrey",  "Lindsay", 1.67, 39, 39);
        persons[18] = new Person("Bevis",  "Wilcox", 1.59, 43, 29);
        persons[19] = new Person("Kylee",  "Barber", 1.61, 44, 39);
        persons[20] = new Person("Gretchen",  "Mcintyre", 1.68, 44, 31);
        persons[21] = new Person("Lucius",  "Bauer", 1.83, 42, 28);
        persons[22] = new Person("Lillian",  "Welch", 1.76, 44, 29);
        persons[23] = new Person("Steel",  "Hoffman", 1.66, 39, 35);
        persons[24] = new Person("Brenden",  "Wong", 1.7, 40, 23);
        persons[25] = new Person("Michael",  "Boyd", 1.53, 38, 25);
        persons[26] = new Person("Aurelia",  "Holt", 1.92, 35, 23);
        persons[27] = new Person("Mercedes",  "Arnold", 1.66, 44, 32);
        persons[28] = new Person("Patience",  "Vaughan", 1.54, 44, 38);
        persons[29] = new Person("Lionel",  "Day", 1.5, 41, 24);
        persons[30] = new Person("Orlando",  "Compton", 1.85, 37, 33);
        persons[31] = new Person("Cora",  "Holmes", 1.74, 41, 32);
        persons[32] = new Person("Lydia",  "Mccormick", 1.73, 38, 33);
        persons[33] = new Person("Lysandra",  "Rollins", 1.61, 44, 24);
        persons[34] = new Person("Brenda",  "Mercer", 1.6, 44, 39);
        persons[35] = new Person("Roary",  "Ruiz", 1.88, 38, 28);
        persons[36] = new Person("Kyra",  "Roy", 1.86, 42, 39);
        persons[37] = new Person("Maggy",  "Ray", 1.76, 40, 28);
        persons[38] = new Person("Darrel",  "Browning", 1.79, 38, 32);
        persons[39] = new Person("Hanae",  "Brock", 1.59, 44, 24);
        persons[40] = new Person("Kaye",  "Day", 1.54, 42, 30);
        persons[41] = new Person("Lev",  "Parks", 1.52, 37, 31);
        persons[42] = new Person("Brenden",  "Fields", 1.74, 38, 18);
        persons[43] = new Person("Noel",  "Sharp", 1.9, 35, 21);
        persons[44] = new Person("Hamilton",  "Poole", 1.61, 42, 29);
        persons[45] = new Person("Jonah",  "Roach", 1.71, 37, 38);
        persons[46] = new Person("Joel",  "Rasmussen", 1.57, 42, 27);
        persons[47] = new Person("Rudyard",  "Bass", 1.59, 44, 35);
        persons[48] = new Person("Simone",  "Adkins", 1.58, 42, 37);
        persons[49] = new Person("Quintessa",  "Ball", 1.79, 40, 27);
        persons[50] = new Person("Caleb",  "Barton", 1.84, 43, 23);
        persons[51] = new Person("Cassady",  "Britt", 1.65, 41, 18);
        persons[52] = new Person("Chancellor",  "Roberts", 1.84, 38, 24);
        persons[53] = new Person("Moses",  "Kent", 1.66, 41, 29);
        persons[54] = new Person("Ivy",  "Mathis", 1.87, 44, 26);
        persons[55] = new Person("Yuri",  "Boyd", 1.67, 42, 27);
        persons[56] = new Person("Oliver",  "Hancock", 1.91, 36, 37);
        persons[57] = new Person("Rogan",  "Travis", 1.94, 43, 21);
        persons[58] = new Person("Teagan",  "Christensen", 1.92, 36, 34);
        persons[59] = new Person("Drew",  "Mccray", 1.57, 37, 37);
        persons[60] = new Person("Lillith",  "Perry", 1.85, 35, 19);
        persons[61] = new Person("Paki",  "Beasley", 1.55, 40, 36);
        persons[62] = new Person("Ignatius",  "Hancock", 1.83, 36, 36);
        persons[63] = new Person("Regina",  "Faulkner", 1.64, 38, 28);
        persons[64] = new Person("Garrison",  "Murphy", 1.59, 36, 31);
        persons[65] = new Person("Clark",  "Hopkins", 1.67, 40, 40);
        persons[66] = new Person("Warren",  "Wise", 1.81, 44, 32);
        persons[67] = new Person("Maggy",  "Collins", 1.87, 38, 36);
        persons[68] = new Person("Amela",  "Solomon", 1.71, 42, 36);
        persons[69] = new Person("Maryam",  "Perry", 1.67, 36, 34);
        persons[70] = new Person("Deacon",  "Perry", 1.84, 43, 20);
        persons[71] = new Person("TaShya",  "Sutton", 1.51, 44, 25);
        persons[72] = new Person("Stacey",  "Glover", 1.56, 42, 20);
        persons[73] = new Person("Shay",  "Wheeler", 1.76, 39, 24);
        persons[74] = new Person("Carla",  "Velazquez", 1.61, 42, 30);
        persons[75] = new Person("Chase",  "Boyd", 1.73, 38, 21);
        persons[76] = new Person("Keegan",  "Shannon", 1.86, 43, 19);
        persons[77] = new Person("Ciaran",  "Farmer", 1.94, 36, 31);
        persons[78] = new Person("Tyrone",  "Moreno", 1.84, 42, 33);
        persons[79] = new Person("Sierra",  "Burt", 1.8, 44, 18);
        persons[80] = new Person("Judah",  "Barnes", 1.77, 39, 35);
        persons[81] = new Person("Maxwell",  "Strong", 1.61, 37, 22);
        persons[82] = new Person("Tashya",  "Garner", 1.83, 40, 31);
        persons[83] = new Person("Jaquelyn",  "Osborne", 1.74, 42, 18);
        persons[84] = new Person("Leandra",  "Wilkins", 1.79, 37, 31);
        persons[85] = new Person("Colt",  "Hoffman", 1.94, 41, 33);
        persons[86] = new Person("Calvin",  "Ingram", 1.66, 36, 25);
        persons[87] = new Person("Pamela",  "Atkinson", 1.67, 44, 38);
        persons[88] = new Person("Nadine",  "Russo", 1.74, 42, 37);
        persons[89] = new Person("Flavia",  "Logan", 1.83, 41, 31);
        persons[90] = new Person("Duncan",  "Tate", 1.72, 40, 39);
        persons[91] = new Person("Yasir",  "Cobb", 1.74, 43, 25);
        persons[92] = new Person("Elijah",  "Anderson", 1.76, 40, 33);
        persons[93] = new Person("Gail",  "Wong", 1.53, 44, 19);
        persons[94] = new Person("Macy",  "Moss", 1.5, 39, 34);
        persons[95] = new Person("Callum",  "Day", 1.82, 44, 21);
        persons[96] = new Person("Kylan",  "Walls", 1.64, 39, 26);
        persons[97] = new Person("Cynthia",  "Black", 1.72, 42, 37);
        persons[98] = new Person("Natalie",  "Hancock", 1.54, 42, 34);
        persons[99] = new Person("Walker",  "Justice", 1.66, 39, 27);

        Person[] unsortedPersons = persons.clone();
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length; j++) {
                if (persons[i].compareTo(persons[j]) > 0) {
                    Person temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }
        }
        System.out.println("--- Unsorted ---");
        for (int i = 0; i < 4; i++) {
            System.out.println(unsortedPersons[i]);
        }
        System.out.println("--- Sorted ---");
        for (int i = 0; i < 4; i++) {
            System.out.println(persons[i]);
        }

//        Sort with comperator
        System.out.println("\n\n");
        System.out.println("--------------------------------");
        System.out.println("|   [Sorted with comperator]   |");
        System.out.println("--------------------------------");
        Person[] unsortedPersons2 = persons.clone();
        Arrays.sort(persons, new PersonComparator());

        System.out.println("--- Unsorted ---");
        for (int i = 0; i < 4; i++) {
            System.out.println(unsortedPersons2[i]);
        }
        System.out.println("--- Sorted ---");
        for (int i = 0; i < 4; i++) {
            System.out.println(persons[i]);
        }

//        Sort with AgeComperator
        System.out.println("\n\n");
        System.out.println("--------------------------------");
        System.out.println("|  [Sorted with AgeComperator]  |");
        System.out.println("--------------------------------");
        Person[] unsortedPersons3 = persons.clone();
        Arrays.sort(persons, new PersonHeightComperator());

        System.out.println("--- Unsorted ---");
        for (int i = 0; i < 4; i++) {
            System.out.println(unsortedPersons3[i]);
        }
        System.out.println("--- Sorted ---");
        for (int i = 0; i < 4; i++) {
            System.out.println(persons[i]);
        }


    }
}
