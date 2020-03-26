package LeetCode.DailyProblem;

import java.util.*;

public class CountCharacters {

    /**
     * 已完成
     */
    public static int countCharacters(String[] words, String chars) {
        int result = 0;
        int len = 0;
        int lenCh = chars.length();
        int strLen = words.length;
        if (lenCh <= 1 || strLen == 0) {
            return result;
        }
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> temp = new HashMap<>();
        for (int i = 0; i < lenCh; i++) {
            int count = 1;
            if (map.containsKey(String.valueOf(chars.charAt(i)))) {
                count = map.get(String.valueOf(chars.charAt(i))) + 1;
                map.put(String.valueOf(chars.charAt(i)), count);
            } else {
                map.put(String.valueOf(chars.charAt(i)), count);
            }
        }
        for (int j = 0; j < strLen; j++) {
            temp.putAll(map);
            String str = words[j];
            int size = str.length() - 1;
            System.out.println("str:" + str);
            System.out.println("old-temp:" + temp);
            while (size >= 0) {
                if (temp.get(String.valueOf(str.charAt(size))) == null) {
                    result = 0;
                    break;
                }
                if (temp.containsKey(String.valueOf(str.charAt(size)))) {
                    int cnt = temp.get(String.valueOf(str.charAt(size)));
                    if (cnt > 1) {
                        cnt--;
                        temp.put(String.valueOf(str.charAt(size)), cnt);
                    } else {
                        temp.remove(String.valueOf(str.charAt(size)));
                    }
                    result++;
                    System.out.println("new-temp:" + temp);
                    size--;
                } else {
                    result = 0;
                    break;
                }

            }
            System.out.println("result:" + result);
            if (result == str.length()) {
                len += result;
                result = 0;
            }
        }
        return len;
    }

    public static void main(String[] args) {

        //"hello","world","leetcode"   welldonehoneyr
        //"cat", "bt", "hat", "tree"   atach
        String[] words = {"qobxtxjzdngkrzamsxzdvbvkiwijokwdyndqllhqpaoxzwonriclsm", "fahtqqnuzhhhrcblquaosdfdcqoskxcsdnhtwvvvzsxkpjprytieieniafnltxmuzwkdnttofpibi", "xedhntgrqegfs", "wrssfvsbcehbahbvojnzgacbgveitirkjmmyiorwykynqddgydzgfvlvplfnyumgxturxraonpchd", "hpmdzhpgijirecxzkuyhptiytnuscu", "xljgysrjjukphjgzbpn", "gmwbirxt", "yhvpsvsnhfmbmcpihnqtodspbvexnpgcqrrughbakbufyjispkquvfppkaffypdpnvikjygdaarcigipfhuvzzzbgw", "gvvbgpjolobpbxcnhnzuqrsqgrkanwmnnkqynakkooailoafunopsrlijqhaqmszssxikftcfoqsw", "naktgxfyuvuoh", "muui", "ghzqskipqprrzeligdjyowypeerogxonvztsq", "onosezgutawtzteoagbftclsqpfsxtwetourxjxurdqevrir", "fcskqxwkzsldsjihahalnw", "lsstgzxjxabcbspjwelqmhtnurgfmdtpaihxnxad", "nwrwtwetgjwooevhxhkzlvsyghtkldioyjhkkniepktqs", "utohzbqvkqkq", "vdoqnhtidgicevprrrwlbtldtaxpsxdhxhgbwlkbeglkbhrujtafswjkozdmdpvwhsuskofmxxtprtpopacslinwozth", "zqlzxpemomnbzxlorvlkxt", "kubshvnldnkofitnnjere", "czxmqpowzzhdbhgtlqdokrzxowsvwyavfhcycctgdvrsfzmanrlktfaetnuayrqkvhcbxezfahkrxgaaztovrxuhnll", "rrcesnfbxglhjawldnnuiiepdsofbrsbjczlemusqwvenicxmtdmpwfrnizymfmqynvtkbrmablcugroshc", "thholqebekkysstqzlbbdapktxumygplqganucwnahmrihiraxdnvbiaqhykcti", "fagqnapzeeglbdzsbneosxmptmwopjcxztukhpjkqjmjbkpbzrfaqskctehyboeddmilkwlurcb", "wtjdykncubkduhxiwwusoxvzpnaxpnzdjmwddnonsmmvwmuaxghetgrwpoeqbprxgviwzagyqopfdakrqjgiy", "nsftehpgzstetbganbtozdopptseucdqkhzdmujnzjdvufqtikgeepttnrabb", "ozihktgnvljzhqwanxemtzxphzqvmoblvi", "iwdsrekqllbbyarzzmbqbvldvxctdeswiyahiwfoefhfsfwktdzaulnalewbusazjhcbtxjuck", "dylhds", "idnaddnzbodhjrpshhahnbbnrskruxszxeeyanumazvahktizectmmvjbhnhbrohsyqhrgq", "scyzsykrwzuozmbrbenfiqpxchtpmcxepjiglaeionsmbwrzeidupayusczcooudpcgkgspbuyzcdfymsejucb", "otpcfrhckxmnseayhwoyjjfkceaoznmmkikpdsuueyqmbsuelmhqnmdsjs", "xoghnhpypfiibqrpgtyux", "cxhpbcziptgandiwxtctdjpboiqwv", "gyjosuhwgbqpcdsdqadopdqozjxpzwxbqaffnxaddhgrxmunpidvpnijxnbawshcznkmprpgkhvzxmzbaftedgtfgjhaisdnva", "jlnxshfthqgzlnvjzztrnjswwsotpybxecyqhnfkbfwvmxpcs", "mtddspmqwbnoiajpexsuhxogarduzsoammqqelh", "sixkvxgnbalipwmkbcwpugpvolsvvlmaaeeobmoeogspbkbsskwjdqkite", "xhsutriuynfrldjbhexhxjgcfwcujvwsqfiaqwvjnkjkswdpaynelhryrzfeqjhajezmolk", "zfiredtxenzgtrkiamuoubetexzbnwkdtxbtihhtsfubnmryxq", "sot", "szgkkhuhkcnr", "firxkgvkzqlnallzwjispsizoawobemuhqrhpyvknasjzwctamfuonder", "vyei", "fidqszoicndwifns", "xkickycwzj", "gmybflbjunudxrwguzditaxmyadgdjeengut", "gvlwwnmrddhzwewugdtobauecealfhasyftgxkiqeluysxxmroukfziifpryvddggttojhcszeyjetbsldmorqnbuqreuxfw", "vbhuerxkcjlkamgruturkbrubbscmvzqruwvlrlyylcvuiothkhpznjzsfnyfoaqkziyjqzdreeygmtbdljwnaojexfgmjlup", "bxjvop", "aswdmctosieicucsjwxych", "lxbtlhnrfyaznrqgxrltmxkjmhdqjjgnvstxaygmuxznjfiiukm", "npncdabkmbgfhnedcmbfyjiplzwymgvsfrifvvjayobsygwolqbwkblqutakcshnlsqadtfiqmpauslvqd", "kuyemuuymacyvmahtagmcewkspverpjtjscccnrczchgkjzppdxcalxxcxrwnepk", "jxwouobfvzttz", "yucpsdhqvzboeezcqpxsepuuk", "iwbdmxdcbypnzqmgkrjhfivkrmnv", "lpqklgcwdvgbghfyoyejnpexrelywqfdtczflwetbxvzigtvisi", "dlasodatffcreungntdmezgfqklrabyymsnhdberufcrgpxgsziklznhdprbczhbxgtuslufycjronozdqumzlnidkvaydg", "oejzlmrrbdysqlezifcvgjnmvodfvmrnjmnfkejdbnnyljzjaxfecrfefdgarqbtwoijuktacywmsubtxtgzkbnstgrsrjpkdfe", "mlegvhxielwlfadlnqvnipcuizpdxgtvro", "vwgmwkbturocovaykdsjaftbtgmtwknnmhexfgcfchpwwgcgecfobbencotjizxbtdrijwfjxdsxanwfjyjamrxrdaiusgr", "xjmkcsekcorldyrjiavrhuhqtndujymc", "rmxwcaorznumwxgwnibnxwzvnxjhzwqzgmkgifnnnnzpgtsvprycjtdeirtpqbduursabbidzkfbexgthkoacagkb", "tkrsxhztwgvqxamjtexklnooaloydjhejlbasavskttwxiabarogvmfdfjttaxhgqljlbfnrvrwwbxkurhufiknoxfmemcv", "cojlyayladyrhofzetaddteqrjbyxtvyszgdorexqmgznqmuvemegbwki", "zktqnurtpttlcjgkmnprqeyeepqunfqqvjwuevwbvnaupyofwiqwhpyumyfwpjrruhleromrmpvczlkxqiuq", "gyxl", "qmhwlymfsjixvvjhkczylqcsnbjxliasetxciggtfl", "gizysqkqbyhzeagzsscvdigtcfiupyhqovaaioxfrphugxzrcjvwqwc", "hpgkulrmbaixnjiapmjiwhwsgromfqpxqkkiscjwpiicslwcijginxfiwqakeezeohhskxgvgdkezmqys", "vibswdyqaxjvqsffwmcismooheyhwzqvyzezluejztlgddshvwcryzcllaisxrygwqyyoiaivfvgtzicycyrkckv", "oyclwdejlifmocfjsbgmernsyitkfaahjxfnwnusrdypsziawlpsjgnavytdihpxcmugshnqbkyfts", "xwcbiporfbktpvqhznjuaxfcdykifuzwdsdhxirwwxinoffywgxscrtuwhvuwjejzqirsfijgguouapqpmfdnpsfm", "qffrjfkj", "rpynimubaxdgbrkdawgugnhobaowxdnzkiidworcsnejgqctftyksvbhiwkcnyffmsbxwptqn", "oeqdvldvfbklukstxwomapaauaozblhxudkdxihepqagndnlkvbqhluscvczhrsrhodnftoszhjdymuywdtjgzbmkrdf", "xviupppkeswkctwlqwyuhokbhqqjshmaeiouhununbhrkabacenkg", "habomjnlznqvckmowgelhnglfizogckplbymkdowfpicxydzgoskckraxpdysksvzezcpg", "zemawxwjeowraaqsqytsshtavnvoyiyollelxqabmjwhxtrdijiacbbjiiyzwkxboot", "jcnpsxnkbqdbh", "bftrbaurtzkftodotjguzjmwxrrmswxwclohotuanypmhtemmsaicwckowmcdmpnhcfzptekpgljfvwpqjgilxu", "bbaigjqxdmuchkkb", "effbptpwafzqbsebbjmvdcxdbmnlfqjklongafzkvaqmkehefedjxgxlbdhltihtgfqjjsdis", "lhuxgqpwcgpujfvvnlrxhgbiwxmxzhglyhkdkafafojtlkuxkmjwlxrd", "ussuyjqsxwsdhkjeipwycrkcxxjatoqhygzymgikqdnqiyyzlbcdlgtmneyickucbkpkza", "ykmsksjorovmdymlbgprvprnyxwppvwgmzfjsqouvgara", "wduqkbncayo", "qdfkyomjlhfozonwpdxllqdnvpohyijqmyymuclnydzmlqksntdfj", "ynzekkkljzrvnwclzcfgtvcmstxgadxpztofckypbgqgbnumnkeaqclaspzxjbygtkjznxeduhbksr", "aw", "jbremnahqoiqktpbkteefdkbrerrxmhqbbselpnfzapgmxidrhbixetaetjcroufa", "wtufuqgljvxzsurhviikdxyuythezjnvwrxqrykmotkhlphlyfljjsfugzwxxfqkc", "ytjuaagqnfxqwiopolnejmoxow", "oqoskpzkwxsffgeuuhdklidtmjobzayatyaqefgwgqbo", "qkhtpuhhkspffkpryvdjasbxhtfrmptpljszvtgvhfvqpxypxfdaphfqdmigzgfg", "goddugelwdvemxwureitzwqmbqeqtymrlrzahuxnpgufaagbpexwpoahvdnsyvgxw", "dfhxrctagxkuasofoejsalcerkbtsjwnbnoahsumzfyiiskhzzwyykeefszrzrbztbrzhxxgaajb", "tjsardsbhmhefysdqtbhzsxukbwdpioqaohloaancxdkkmofniojrvxj", "jzjozqfqiwyfadplibubtpcfxxfvjtbizxlmpaccjpihvnrtvfqtfiaztvfbednyemfmahbljdvykddawaujdksenm"};
        System.out.println(countCharacters(words, "fcxpzkzkqeyeijquyfixvlzjpzomujrqzxeoynjiflnmdrpdkrm"));
    }
}
