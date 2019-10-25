import java.util.Arrays;

public class EntryPoint {
	public static String[][] result = null;
	public static void main(String[] args) {
		String[] arrRow = {"HCC:46~DC:12","HCC:50~DC:1","pqr","","","PC:26~DC:45","xyz","","amit"};
		String strDel = "~,=,:";
		String[] arrDel = strDel.split(",");
		result = new String[arrRow.length + 1][];
		for(int jRow = 0 ; jRow < arrRow.length ; jRow++) {
			splitString(arrRow[jRow],jRow+1 ,arrDel);	
		}
		for(int i = 0 ;i < result.length; i++) {
			if(result[i] != null) {
				for(int j = 0 ; j < result[i].length ; j++) {
					System.out.print(result[i][j] + "\t");
				}
			System.out.println();
			}
		}
	}
	private static void splitString(String strRow, int jRow ,String[] strDel) {
		if(strDel.length > 0) {
			if(strRow.contains(strDel[0])) {
				String[] strData = strRow.split(strDel[0]);
				if(strDel.length == 1 || CheckIfLastDelimDoNotExit(strRow,strDel)) {
					System.out.println(strData[0] + strDel[0]+ strData[1]);				
					for(int i = 0 ;i < result.length; i++) 
					{
						if( i == 0) 
						{
							if(result[i] != null ) 
							{
								if(result[jRow] == null) {
									result[jRow] = new String[result[0].length];
									for(int j = 0 ; j < result[jRow].length ; j++)
										result[jRow][j] = "";
								}
								boolean isContains = false;
								int j = 0 ;
								for(j =0 ; j< result[i].length;j++) 
								{					
									if(result[i][j].equals(strData[0])) {
										isContains = true;
										break;
									}
									else {
										isContains = false;
									}
								}
								if(!isContains) {
									result[i] = Arrays.copyOfRange(result[i],0,result[i].length+1);
									result[jRow] = Arrays.copyOfRange(result[jRow],0,result[jRow].length+1);
									result[i][result[i].length - 1] = strData[0];
									result[jRow][result[i].length - 1] = strData[1];
								}
								else {
									result[jRow][j] = strData[1];
								}
							}
							else 
							{
								result[i] = new String[1];
								result[jRow] = new String[1];
								result[i][0] = strData[0];
								result[jRow][0] = strData[1];
							}
						}
						else 
						{
							if(result[i] != null) {
								if(result[i].length != result[0].length) {
									result[i] = Arrays.copyOfRange(result[i],0,result[i].length+1);
									result[i][result[i].length - 1] = "";
								}
							}
						}
						
					}			
					
				}
				else {
					strDel = Arrays.copyOfRange(strDel, 1, strDel.length);
					for(int i =0 ; i < strData.length ; i ++) {
						splitString(strData[i],jRow, strDel);
					}
				}
			}
			else {
				if(strDel.length > 1) {
					strDel = Arrays.copyOfRange(strDel, 1, strDel.length);				
					splitString(strRow,jRow, strDel);
				}
				else {
					if(!strRow.equals("")) {
					for(int i = 0 ;i < result.length; i++) 
					{
						if( i == 0) 
						{
							result[i] = Arrays.copyOfRange(result[i],0,result[i].length+1);
							result[i][result[i].length - 1] = strRow;
							result[jRow] = new String[result[i].length];
							for(int j=0 ; j < result[i].length;j++)
								result[jRow][j] = "";
						}
						else 
						{
							if(result[i] != null) {
								if(result[i].length != result[0].length) {
									result[i] = Arrays.copyOfRange(result[i],0,result[i].length+1);
									result[i][result[i].length - 1] = "";
								}
							}
						}
						
					}}		
				}
			}
		}
	}
	private static boolean CheckIfLastDelimDoNotExit(String strRow, String[] strDel) {
		if(strDel.length == 2) {
			if(!strRow.contains(strDel[1]))
				return true;
		}
		return false;
	}
}

