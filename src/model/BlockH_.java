package model;

import java.awt.Color;

/**
 * 이 BlockH_ 클래스는 Block을 상속하고 있으며, H_ Block을 구현한 Class 입니다.
 * 
 * @author 곽소정
 *
 */
public class BlockH_ extends Block {

	/**
	 * GameBoard 위에 H_ Block을 생성합니다.
	 * 
	 * @param gameBoard
	 *            - Block이 생성될 GameBoard 입니다.
	 */
	public BlockH_(GameBoard1P gameBoard) {
		super(gameBoard);
		initShape1P();

	}

	public BlockH_(GameBoardSolo gameBoardSolo) {
		super(gameBoardSolo);
		initShapeSolo();
	}

	public BlockH_(GameBoard2P gameBoard2P) {
		super(gameBoard2P);
		initShape2P();
	}

	/** Block 의 모양을 결정합니다. */
	@Override
	public void initShape1P() {
		setSpinBehavior1P(new SpinBlock3x3());
		setTopLeftPoint1P(new Point(1, 4));
		tempTopLeftPoint1P = new Point(2, 4);
		color = new Color(8, 145, 49);
		coord1P = new Point[] { new Point(0, 1), new Point(-1, 0), new Point(0, 0), new Point(1, 0), new Point(2, 0) };
		tempCoord1P = new Point[] { new Point(0, 1), new Point(-1, 0), new Point(0, 0), new Point(1, 0), new Point(2, 0) };
	}

	public void initShape2P() {
		setSpinBehavior2P(new SpinBlock3x3());
		setTopLeftPoint2P(new Point(1, 4));
		tempTopLeftPoint2P = new Point(2, 4);
		color = new Color(8, 145, 49);
		coord2P = new Point[] { new Point(0, 1), new Point(-1, 0), new Point(0, 0), new Point(1, 0), new Point(2, 0) };
		tempCoord2P = new Point[] { new Point(0, 1), new Point(-1, 0), new Point(0, 0), new Point(1, 0), new Point(2, 0) };
	}

	public void initShapeSolo() {
		setSpinBehaviorSolo(new SpinBlock3x3());
		setTopLeftPointSolo(new Point(1, 4));
		tempTopLeftPointSolo = new Point(2, 4);
		color = new Color(8, 145, 49);
		coordSolo = new Point[] { new Point(0, 1), new Point(-1, 0), new Point(0, 0), new Point(1, 0), new Point(2, 0) };
		tempCoordSolo = new Point[] { new Point(0, 1), new Point(-1, 0), new Point(0, 0), new Point(1, 0), new Point(2, 0) };
	}

	/** 블럭의 위치를 바꿉니다. */
	@Override
	public void changeCoord1P() {
		gameBoard1P.changePoint(topLeftPoint1P.setCurrentPoint1P(coord1P[0]), 15);
		gameBoard1P.changePoint(topLeftPoint1P.setCurrentPoint1P(coord1P[1]), 15);
		gameBoard1P.changePoint(topLeftPoint1P.setCurrentPoint1P(coord1P[2]), 15);
		gameBoard1P.changePoint(topLeftPoint1P.setCurrentPoint1P(coord1P[3]), 15);
		gameBoard1P.changePoint(topLeftPoint1P.setCurrentPoint1P(coord1P[4]), 15);
		
	}

	public void changeCoord2P() {
		gameBoard2P.changePoint(topLeftPoint2P.setCurrentPoint2P(coord2P[0]), 15);
		gameBoard2P.changePoint(topLeftPoint2P.setCurrentPoint2P(coord2P[1]), 15);
		gameBoard2P.changePoint(topLeftPoint2P.setCurrentPoint2P(coord2P[2]), 15);
		gameBoard2P.changePoint(topLeftPoint2P.setCurrentPoint2P(coord2P[3]), 15);
		gameBoard2P.changePoint(topLeftPoint2P.setCurrentPoint2P(coord2P[4]), 15);
	}
	public void changeCoordSolo() {
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[0]), 15);
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[1]), 15);
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[2]), 15);
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[3]), 15);
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[4]), 15);
	}

}
