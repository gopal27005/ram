import java.util.Scanner;
class bellmanord
{
    public static void bellmanFord(int[][] graph, int V, int E, int src)
    {
         int[] dist= new int[V];
         for (int i=0; i< V; i++)
         {
            dist[i]= Integer.MAX_VALUE;
         }
         dist[src]=0;
         for (int i=1; i<V; i++)
         {
          for (int j=0;j<E;j++)
          {
               int u=graph[j][0];
               int v=graph[i][1];
               int weight=graph[j][2];
               if(dist[u]!=Integer.MAX_VALUE && dist[u]+weight<dist[v])
               {
                    dist[v]=dist[u]+weight;
               }
          }
         }
         for(int j=0;j<E;j++)
         {
          int u=graph[j][0];
          int v=graph[j][1];
          int weight=graph[j][2];
          if(dist[u]!=Integer.MAX_VALUE && dist[u]+weight<dist[v])
          {
               System.out.println(".(Graph contains neg weight cycle)");
               return;
          }
         }
         printSolution(dist,V);
         }
         public static void printSolution(int[]dist,int v)
         {
          System.out.println("Vertex distance from source");
          for (int i=0;i<V;i++)
          {
               System.out.println(i+"\t\t"+dist[i]);
          }
          }
          public static void main(String[] args)
           {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter number of vertices");
               int V=sc.nextInt();
               System.out.println("Enter the edges with source, dest, and weight");
               for (int i=0;i<E;i++)
               {
                    
               }
              

         }
    }
}
