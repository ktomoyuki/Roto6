import java.util.Random;
class Roto6 {
  public static void main(String args[]) {
    Random rand = new Random();
    	int num = 0;
    	int[] box = {0,0,0,0,0,0};
		for(int i = 0;i < box.length; i++){
		num = rand.nextInt(44);
			while((num == box[0])||(num == box[1])||(num == box[2])||(num == box[3])||(num == box[4])||(num == box[5])||(num == 0)){
			num = rand.nextInt(44);
			
			}
		box[i] = num;
		}

		for(int x = 0; x < box.length; x++){
		
 		}

		for(int a = 0; a < box.length - 1; a++){
			for(int b = a + 1; b < box.length; b++){
				if(box[a] > box[b]){
				int temp = box[a];
				box[a] = box[b];
				box[b] = temp;
				}
			}
		}

			
		for(int x = 0; x < box.length; x++){
		System.out.println(box[x]);
 		}
  }
}
