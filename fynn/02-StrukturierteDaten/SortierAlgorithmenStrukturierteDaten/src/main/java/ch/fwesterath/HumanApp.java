package ch.fwesterath;

import ch.fwesterath.model.Human;
import ch.fwesterath.model.HumanComparator;

import java.util.Arrays;


public class HumanApp {

    public static void main(String[] args) {
        Human[] humans = new Human[100];
        humans[0] = new Human("Maxine Chambers", "6405", "LV94OSKJ6752573215228", "Belgium");
        humans[1] = new Human("Christian Sellers", "46523", "LU593228780377845666", "Costa Rica");
        humans[2] = new Human("Talon Savage", "4360", "DO19268945581888486262722172", "Russian Federation");
        humans[3] = new Human("Josiah Workman", "71848", "SM8114003924448850867539531", "South Korea");
        humans[4] = new Human("Keegan Marshall", "807542", "NL54XNBT7440688133", "Pakistan");
        humans[5] = new Human("Maryam Coffey", "3287", "FR3147751857962102725746567", "Peru");
        humans[6] = new Human("Jasmine Quinn", "36348280", "NL96HHCR1308772043", "Austria");
        humans[7] = new Human("Winifred Weeks", "36357", "IS683604421515180219747611", "Ireland");
        humans[8] = new Human("Hilel Booker", "888882", "BE56681665322314", "Austria");
        humans[9] = new Human("Alan Chang", "6197", "MC9525135581465377506136567", "Philippines");
        humans[10] = new Human("Quyn Alford", "31526", "LV48ZQIR6840255922140", "Singapore");
        humans[11] = new Human("Tatiana Horn", "08283", "CZ3078145439535752689391", "Singapore");
        humans[12] = new Human("Jamalia Gallagher", "87281", "IE13ISEQ01183511178541", "Germany");
        humans[13] = new Human("Timon Ingram", "9628", "KZ707488120208132071", "Turkey");
        humans[14] = new Human("Jesse Hayden", "82380", "GT49738170042012185430387614", "United States");
        humans[15] = new Human("Maite Dorsey", "12276", "RO47GOCD2327356125514143", "Chile");
        humans[16] = new Human("Aaron Garner", "207566", "BA928978257587940111", "Netherlands");
        humans[17] = new Human("Alexa Ayala", "832865", "PT58778422236910770333192", "China");
        humans[18] = new Human("Victor Sharp", "35826", "MR1223385344863481217248651", "Pakistan");
        humans[19] = new Human("Kamal Moody", "669842", "GE66712174356515150184", "Turkey");
        humans[20] = new Human("Quail Mccall", "84083", "LB15042177922167702243241938", "Russian Federation");
        humans[21] = new Human("Cheyenne Barrett", "N5L 8H6", "DE90238424744622884164", "South Korea");
        humans[22] = new Human("Cleo Mosley", "650132", "CR9460038648357756381", "Vietnam");
        humans[23] = new Human("Belle Mcintyre", "676673", "SA4332710178728550673773", "Russian Federation");
        humans[24] = new Human("Ferris Garrett", "1657", "CZ5238215476865522888282", "Belgium");
        humans[25] = new Human("Todd Erickson", "2158", "TN1621713947042647354824", "South Korea");
        humans[26] = new Human("Eliana Howard", "96328", "NO4494377615888", "Belgium");
        humans[27] = new Human("Alma Bolton", "776", "SE4761375256384200341706", "Brazil");
        humans[28] = new Human("Lillian Hicks", "56617", "HR2375979153114601953", "Austria");
        humans[29] = new Human("Bevis Dickerson", "640132", "MT20QHOB26889668933684965504742", "Peru");
        humans[30] = new Human("Kevin Blanchard", "2583", "IS843232663774854832819653", "Nigeria");
        humans[31] = new Human("Miranda Johns", "877883", "SA4987604631579606702750", "Sweden");
        humans[32] = new Human("Oleg Burch", "827", "KZ318912056881397203", "Norway");
        humans[33] = new Human("Leroy Colon", "5732735", "TR741276734529955237894080", "Canada");
        humans[34] = new Human("Serina Bennett", "222686", "FI7845721923214739", "United States");
        humans[35] = new Human("Rhiannon Farmer", "3467", "GE55875912322458987371", "United States");
        humans[36] = new Human("Dai Hayes", "348910", "MK49065414351342400", "Costa Rica");
        humans[37] = new Human("Branden Raymond", "62486", "GB44DLWU79453582587022", "Australia");
        humans[38] = new Human("Shay Grant", "7638", "MC1555444389933205889756016", "China");
        humans[39] = new Human("Sophia Watts", "215282", "AL43433772122355728893432086", "United States");
        humans[40] = new Human("Jasper Martinez", "P1O 1FM", "CR1262486682132035484", "Philippines");
        humans[41] = new Human("Amela Ferrell", "897147", "LT648962148761875697", "Russian Federation");
        humans[42] = new Human("Uriah Pickett", "876717", "AE353370816115827768014", "Philippines");
        humans[43] = new Human("Rashad Horn", "529446", "EE775092563436866431", "Indonesia");
        humans[44] = new Human("Byron Robbins", "798425", "BA495727107145113124", "Chile");
        humans[45] = new Human("Amal Hickman", "3251", "MR1388520440453722975379321", "Vietnam");
        humans[46] = new Human("Maryam Copeland", "5764", "KZ410544875776672945", "Brazil");
        humans[47] = new Human("Alan Howard", "4407", "GE66287567682073531137", "Indonesia");
        humans[48] = new Human("Louis Barber", "847447", "SE7937352816739241217473", "Brazil");
        humans[49] = new Human("Maia English", "14368", "LB25484630870871262480276432", "United States");
        humans[50] = new Human("Hoyt Galloway", "1440", "PT41822537375517663368822", "France");
        humans[51] = new Human("Branden Haynes", "5637", "FO5456271765461813", "Poland");
        humans[52] = new Human("Doris Whitley", "5790", "AL97560317884524534523324227", "United Kingdom");
        humans[53] = new Human("Amaya Dickson", "6683", "PL45283171575565867565489321", "Nigeria");
        humans[54] = new Human("Nomlanga Emerson", "8069", "MR7544971236493284613601852", "South Korea");
        humans[55] = new Human("Francis Heath", "25824", "MK74547581741585561", "Nigeria");
        humans[56] = new Human("Jane Watkins", "62453", "RO38BCRM5049651115567664", "South Africa");
        humans[57] = new Human("Hayfa Campos", "58115", "GT29942157407919858162285689", "Ireland");
        humans[58] = new Human("Erica Madden", "4502", "HR1364785716532784630", "South Africa");
        humans[59] = new Human("Benedict Frederick", "I73 4UQ", "DO25376591281822528728734750", "Chile");
        humans[60] = new Human("Judah Boyd", "545", "PS625240535661849825215187124", "Philippines");
        humans[61] = new Human("Stephen Brooks", "941259", "SK1915458125264474115393", "Costa Rica");
        humans[62] = new Human("Quyn Gregory", "26148", "AL92289732544178814501036593", "India");
        humans[63] = new Human("Shad Mcconnell", "221414", "HU55481338776481615857168277", "Ireland");
        humans[64] = new Human("Cathleen O'brien", "18162", "SE1693760055174447245700", "Peru");
        humans[65] = new Human("Bevis Lopez", "8458", "VG5547263243334842136718", "India");
        humans[66] = new Human("Molly Small", "2930", "MC9337863913388577115422766", "Netherlands");
        humans[67] = new Human("Raya Crane", "543241", "DO29058478970151664151816163", "Mexico");
        humans[68] = new Human("Daphne Mendoza", "9451", "AZ57503822615241753062551641", "Ireland");
        humans[69] = new Human("Nigel Ballard", "76741", "ES5381126968786381044143", "Mexico");
        humans[70] = new Human("Damian Olson", "58751", "BE15266475783351", "Canada");
        humans[71] = new Human("Connor Oneal", "3565", "BE03414853844377", "Chile");
        humans[72] = new Human("Germane Johns", "88844318", "MT43GDZS88034806596472333420384", "Chile");
        humans[73] = new Human("Dustin Houston", "252447", "MR7185316327294234383182140", "Australia");
        humans[74] = new Human("Remedios Alvarez", "233718", "FI9869505768606112", "United Kingdom");
        humans[75] = new Human("Tatyana Roy", "6358", "BA088949329437753585", "South Africa");
        humans[76] = new Human("Cade Dillard", "9116", "LU061152539607076785", "Italy");
        humans[77] = new Human("Maile Bray", "614854", "BH30785334336692818588", "Vietnam");
        humans[78] = new Human("Fitzgerald Benson", "38540", "FI5518452137322240", "Nigeria");
        humans[79] = new Human("September Middleton", "41118", "DK3593473113519305", "France");
        humans[80] = new Human("Shay Boyd", "5675761047", "DE72240516034866676578", "Turkey");
        humans[81] = new Human("Cassidy Henry", "220454", "SI46174187181523727", "Colombia");
        humans[82] = new Human("Mohammad Spence", "748534", "EE219077468311714952", "Chile");
        humans[83] = new Human("Diana Marks", "1145", "KZ894756671555386114", "Ukraine");
        humans[84] = new Human("Julian Rasmussen", "683010", "IS616515551375250624584745", "Ireland");
        humans[85] = new Human("Jameson Franklin", "72124", "PS608254688834487688194086391", "Vietnam");
        humans[86] = new Human("Claudia Mcintosh", "723405", "DO39645571735468108350532564", "Russian Federation");
        humans[87] = new Human("Ruth Good", "51336", "BH24389886631876971234", "Sweden");
        humans[88] = new Human("Tate Mccarty", "54154", "GR0451726623384529224148218", "United Kingdom");
        humans[89] = new Human("Nehru Bonner", "7873", "ES8438872800274328616194", "Colombia");
        humans[90] = new Human("Adria Terry", "94533", "PK4362621516251744056676", "France");
        humans[91] = new Human("Caleb Jennings", "42861", "MK39715427759404837", "Austria");
        humans[92] = new Human("Kennan Mccray", "54112", "CY87114133265772322441376225", "Ukraine");
        humans[93] = new Human("Eric Madden", "98553", "MU0785104204146463171565184520", "Poland");
        humans[94] = new Human("Jonas Alford", "4013", "EE254972144331346569", "Austria");
        humans[95] = new Human("Karen Reyes", "6548", "AZ65442212476229496420911257", "Italy");
        humans[96] = new Human("Kermit Vinson", "2354", "AL60336932367394353355195258", "Nigeria");
        humans[97] = new Human("Arden Brooks", "35454", "BA389403325344412213", "Germany");
        humans[98] = new Human("Heather Frazier", "6658", "GB56UNMP98600566411782", "Sweden");
        humans[99] = new Human("Hakeem Park", "533760", "GI21WCKX846711620607375", "Russian Federation");

        Human[] unsortedHumans = humans.clone();
        for (int i = 0; i < humans.length; i++) {
            for (int j = 0; j < humans.length - 1; j++) {
                if (humans[j].getName().compareTo(humans[j + 1].getName()) > 0) {
                    Human temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }

        }
        System.out.println("--- Unsorted ---");
        for (Human human : unsortedHumans) {
            System.out.println(human);
        }
        System.out.println("--- Sorted ---");
        for (Human human : humans) {
            System.out.println(human);
        }

        System.out.println("\n\n");
        System.out.println("--------------------------------");
        System.out.println("|   [Sorted with comperator]   |");
        System.out.println("--------------------------------");

        Human[] humans2 = unsortedHumans.clone();
        Arrays.sort(humans2, new HumanComparator());
        System.out.println("--- Unsorted ---");
        for (Human human : humans2) {
            System.out.println(human);
        }
        System.out.println("--- Sorted ---");
        for (Human human : humans2) {
            System.out.println(human);
        }
    }
}
