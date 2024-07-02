package com.pattern.domain.facad;

/*
 * 작성일:2024-07-02
 * 작성자:황석현
 * 개요: 파사드 패턴 적용
 * 		
 */
public class Main {
	
	//클라이언트가 현금인출기에서 계좌를 선택하는 전략
	private static Account kbButton() {
		return new KbStrategy();
	}
	
	private static Account ibkButton() {
		return new IbkStrategy();
	}

    public static void main(String[] args) {
    	
    	System.out.println("ATM 현금인출기 카드목록");
    	
    	//#1. 현금인출기 생성
        AtmMachine atmMachine = new AtmMachine();
        
        //#2. KB국민은행 카드로 현금인출
        String KB = atmMachine.account(kbButton());
        System.out.println(atmMachine.account(kbButton()));
        
        //#3. IBK기업은행 카드로 현금인출
        String ibk = atmMachine.account(ibkButton());
        System.out.println(atmMachine.account(ibkButton()));

    }

}
