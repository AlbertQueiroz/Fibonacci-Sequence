import javax.swing.JOptionPane;
public class Main{
	public static void main(String[] args){
		String Fib = JOptionPane.showInputDialog("Informe o número");
		int n = Integer.parseInt(Fib);
		String seqFib = String[n];
		int a = 1; int b = 1;int c = 0; 
		for (int i=0; i<=n; i++){
			if (i==n)
				seqFib[n]=c;
			else
				seqFib[n]=c + ",";
			a=b+c;
			b=c;
			c=a;
		}
		JOptionPane.showMessageDialog(null,
		"Sequencia Fibonacci: "+seqFib,
		JOptionPane.ERROR_MESSAGE);
		System.out.print(seqFib);
	}
}