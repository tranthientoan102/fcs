public class ATM{

	public String run(double cashAmount){
		boolean ableToWithdraw = false;
		String errorCode = "000";
		String result;
		String BAD_RESULT = "Sorry, the value you input cannot be withdrew (ErrorCode: %s)\n";
		int goodCashAmount;
		int x20 = 0, x50 = 0, remain = 0;

		if (cashAmount % 10 != 0) {
			errorCode = "001";
		} else {
			goodCashAmount = (int)cashAmount;

			// round 1
			x50 = goodCashAmount / 50;
			remain = goodCashAmount % 50;
			x20 = remain / 20;
			remain = remain % 20;

			if (remain == 0) {
				ableToWithdraw = true;
			} else if ((remain != 0) && (x50 ==0)) {
				errorCode = "002";
			} else {
				// round 2: remaining 10$
				// update from round 1
				// return 1 $50 back to remain
				x50 -= 1;
				remain += 50;
				// change remaining to $20, add together with round 1
				x20 += remain / 20;

				// this case is always convertable
				ableToWithdraw = true;
			}
		}

		if (ableToWithdraw) {
			result = String.format("Here is %d $20 notes and %d $50 notes.\n", x20, x50);
		} else result = String.format(BAD_RESULT, errorCode);

		return result;
	}

}