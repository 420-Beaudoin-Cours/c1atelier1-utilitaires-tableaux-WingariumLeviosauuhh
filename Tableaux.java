/**
 * @author France Beaudoin
 */
public class Tableaux {
    private static void permute(int[] tab, int i1, int i2){
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2){
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierCroissantSSS(String[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }
    
    public static void trierDecroissantSSS(int[] tab){
    
    }
    
    public static void print(int[] tab){
        for(int i : tab){
            System.out.println(i);
        }
    }
    
    public static int maximum(int[] tab){
        int max = 0;
        
        for(int i : tab){
            if(i > max){
                max = i;
            }
        }
        
        return max;
    }
    
    public static int minimum(int[] tab){
        int min = Integer.MAX_VALUE;
        
        for(int i : tab){
            if(i < min){
                min = i;
            }
        }
        
        return min;
    }
    
    public static double moyenne(int[] tab){
        double somme = 0;
        
        for(int i : tab){
            somme += i;
        }
        
        return somme/tab.length;
    }
    
    public static int fouilleSeq(int[] tab, int val){
        int i = 0;
        boolean isFound = false;
        
        while(!isFound && i < tab.length){
            isFound = (tab[i] == val);
            i++;
        }
        
        return (isFound) ? i : -1;
    }
}
