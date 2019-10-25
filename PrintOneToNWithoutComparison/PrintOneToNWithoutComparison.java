
public class PrintOneToNWithoutComparison {

	public interface IPrintHandler{
		void handleNumber(IPrintHandler[] arrPH,long num);
	}
	
	public class PrintZero implements IPrintHandler{

		@Override
		public void handleNumber(IPrintHandler[] arrPH, long num) {			
		}		
	}
	
	public class PrintNonZero implements IPrintHandler{

		@Override
		public void handleNumber(IPrintHandler[] arrPH, long num) {
			long jNext = getNextFunctionToCallIndex(num -1);
			arrPH[(int)jNext].handleNumber(arrPH, num -1);
			System.out.println(num);
		}	
		
	}
	private static long getNextFunctionToCallIndex(long num) {
		long jBitVal = 0;
		long jNext = 0;
		jBitVal = (((1 << 0x00) & num) >> 0x00) & (1);
		jNext |= jBitVal;		
		jBitVal = (((1 << 0x01) & num) >> 0x01) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x02) & num) >> 0x02) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x03) & num) >> 0x03) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x04) & num) >> 0x04) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x05) & num) >> 0x05) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x06) & num) >> 0x06) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x07) & num) >> 0x07) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x08) & num) >> 0x08) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x09) & num) >> 0x09) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x0A) & num) >> 0x0A) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x0B) & num) >> 0x0B) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x0C) & num) >> 0x0C) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x0D) & num) >> 0x0D) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x0E) & num) >> 0x0E) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x0F) & num) >> 0x0F) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x10) & num) >> 0x10) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x11) & num) >> 0x11) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x12) & num) >> 0x12) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x13) & num) >> 0x13) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x14) & num) >> 0x14) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x15) & num) >> 0x15) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x16) & num) >> 0x16) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x17) & num) >> 0x17) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x18) & num) >> 0x18) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x19) & num) >> 0x19) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x1A) & num) >> 0x1A) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x1B) & num) >> 0x1B) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x1C) & num) >> 0x1C) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x1D) & num) >> 0x1D) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x1E) & num) >> 0x1E) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x1F) & num) >> 0x1F) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x20) & num) >> 0x20) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x21) & num) >> 0x21) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x22) & num) >> 0x22) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x23) & num) >> 0x23) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x24) & num) >> 0x24) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x25) & num) >> 0x25) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x26) & num) >> 0x26) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x27) & num) >> 0x27) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x28) & num) >> 0x28) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x29) & num) >> 0x29) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x2A) & num) >> 0x2A) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x2B) & num) >> 0x2B) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x2C) & num) >> 0x2C) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x2D) & num) >> 0x2D) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x2E) & num) >> 0x2E) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x2F) & num) >> 0x2F) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x30) & num) >> 0x30) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x31) & num) >> 0x31) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x32) & num) >> 0x32) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x33) & num) >> 0x33) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x34) & num) >> 0x34) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x35) & num) >> 0x35) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x36) & num) >> 0x36) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x37) & num) >> 0x37) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x38) & num) >> 0x38) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x39) & num) >> 0x39) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x3A) & num) >> 0x3A) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x3B) & num) >> 0x3B) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x3C) & num) >> 0x3C) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x3D) & num) >> 0x3D) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x3E) & num) >> 0x3E) & (1);
		jNext |= jBitVal;
		jBitVal = (((1 << 0x3F) & num) >> 0x3F) & (1);
		jNext |= jBitVal;
		
		return jNext;
	}
	public static void main(String[] args) {
			
		PrintZero pPrintZero = new PrintOneToNWithoutComparison().new PrintZero();
		PrintNonZero PrintNonzero =  new PrintOneToNWithoutComparison().new PrintNonZero();
		IPrintHandler[] aPH = { pPrintZero, PrintNonzero };
		long num = 123;
		// Blank out the MSB
		num &= (~(0x01<<0x3f));
		long jNext = getNextFunctionToCallIndex(num);
		aPH[(int)jNext].handleNumber(aPH, num);
	}

}
