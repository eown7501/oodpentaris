package ranking;

import java.util.*;

/**
 * 이 Class는 RankingData를 저장합니다.
 * 
 * @author 이은경
 *
 */
public class RankingData{
	
	/** 점수를 저장할 변수 입니다. */
	int score;
	/** 이름을 저장할 변수 입니다. */
	String name;
	/** 문자열을 저장할 변수입니다. */
	String str;
	/** token을 저장할 변수입니다. */
	private StringTokenizer token;
	
	/** RankingData 를 생성합니다. */
	public RankingData() {
		this.score = 0;
		this.name = "";
	}
	
	/**
	 * RankingData 를 생성합니다.
	 * @param name - 이 이름을 가집니다.
	 * @param score - 이 점수를 가집니다.
	 */
	public RankingData(String name, int score) {
		this.score = score;
		this.name = name;
		str = name + " " +score;
	}
	
	/**
	 * RankingData 를 생성합니다.
	 * @param str - 이 문자열을 가집니다.
	 */
	public RankingData(String str) {
		this.str = str;
		token = new StringTokenizer(this.str, " ");
		name = token.nextToken();
		if(token.hasMoreTokens())
			score = Integer.parseInt(token.nextToken());
	}
}