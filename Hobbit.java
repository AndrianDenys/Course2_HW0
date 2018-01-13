public class Hobbit extends  Character{

    /*
                      ,-'`\
                ,'   ,-`\            / \
               (    |` ,`-,         _|_|_
                \  (`    `,     _,.,'  /
                 \ )`'   ',' ,-'   \,_/
                  `\_   -|_,')    ,/
                 ,-[__>-'     ._,'
               ,'/           ,/
            _,' /         ,-'
          ,'/  /           |
         (   ,/|          /
      ,-'\_,/ /          '|
    ,/|,-'    |--,.'`-,--'
    '-/'      |         /
               \       \
              / `.     _\
             /    \-    `\
            /     /\      )
           /     / /     /
     */
    protected int hp = 3;
    protected int power = 0;
    private boolean isAlive = true;
    public void kick{
        if (hp > 1) {
            toCry();
        }
        else{
            System.out.println("Now he is no more.");
            isAlive = false;
        }
    }
    public void toCry{
        System.out.println("Poor hobbit cries because of you.");
    }
}
