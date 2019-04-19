public static List<String> mergeSort(List<String> dataUnsorted) {
       List<String> data = new ArrayList<String>(dataUnsorted);
       if (data.size() <= 1) {
           comparisons++;
           return data;
       }

       List<String> leftBranch = new ArrayList<String>();
       List<String> rightBranch = new ArrayList<String>();
       int i = 0;
       for (String item : data) {
           comparisons++;
           if (i < data.size()/2) {
               leftBranch.add(item);
               moves++;
           } else {
               rightBranch.add(item);
               moves++;
           }
           i++;
       }

       leftBranch = mergeSort(leftBranch);
       rightBranch = mergeSort(rightBranch);
       return merge(leftBranch, rightBranch);
   }

   /**
    * Performs the merging role of the merge sort implementation
    *
    * @param leftBranch The left branch to merge
    * @param rightBranch The right branch to merge
    *
    * @return The two merged branches
    *
    * @see mergeSort
    */
   public static List<String> merge(List<String> leftBranch, List<String> rightBranch) {
       List<String> merged = new ArrayList<String>();
       while (leftBranch.size() > 0 && rightBranch.size() > 0) {
           comparisons++;
           if (leftBranch.get(0).compareTo(rightBranch.get(0)) < 0) {
               merged.add(leftBranch.get(0));
               leftBranch.remove(0);
               moves++;
           } else {
               merged.add(rightBranch.get(0));
               rightBranch.remove(0);
               moves++;
           }
       }

       while (leftBranch.size() != 0) {
           comparisons++;
           merged.add(leftBranch.get(0));
           leftBranch.remove(0);
           moves++;
       }

       while (rightBranch.size() != 0) {
           comparisons++;
           merged.add(rightBranch.get(0));
           rightBranch.remove(0);
           moves++;
       }
       return merged;
   }
