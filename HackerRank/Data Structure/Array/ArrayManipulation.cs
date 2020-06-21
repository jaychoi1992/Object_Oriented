using System;
namespace HackerRank
{
    public class ArrayManipulation
    {
	static long arrayManipulation(int n, int[][] queries)
        {
            int[] result = new int[n+1];
            foreach (int[] query in queries)
            {
                int a = query[0] - 1;
                int b = query[1];
                int k = query[2];
                result[a] += k;
                result[b] -= k;
            }
            int maxval = 0;
            int counter = 0;
            foreach (int res in result)
            {
                counter += res;
                if (counter > maxval)
                {
                    maxval = counter;
                }
            }
            return maxval;
        }
        public ArrayManipulation()
        {
TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            string[] nm = Console.ReadLine().Split(' ');

            int n = Convert.ToInt32(nm[0]);

            int m = Convert.ToInt32(nm[1]);

            int[][] queries = new int[m][];

            for (int i = 0; i < m; i++)
            {
                queries[i] = Array.ConvertAll(Console.ReadLine().Split(' '), queriesTemp => Convert.ToInt32(queriesTemp));
            }

            long result = arrayManipulation(n, queries);

            textWriter.WriteLine(result);

            textWriter.Flush();
            textWriter.Close();
        }
    }
}
