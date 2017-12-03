package model;

import java.awt.Color;

/**
 * 이 BlockH 클래스는 Block을 상속하고 있으며, H Block을 구현한 Class 입니다.
 * 
 * @author 곽소정
 *
 */
public class BlockH extends Block {

	/**
	 * GameBoard 위에 H Block을 생성합니다.
	 * 
	 * @param gameBoard
	 *            - Block이 생성될 GameBoard 입니다.
	 */
	public BlockH(GameBoard1P gameBoard) {
		super(gameBoard);
		initShape1P();

	}

	public BlockH(GameBoardSolo gameBoardSolo) {
		super(gameBoardSolo);
		initShapeSolo();
	}

	public BlockH(GameBoard2P gameBoard2P) {
		super(gameBoard2P);
		initShape2P();
	}

	/** Block 의 모양을 결정합니다. */
	@Override
	public void initShape1P() {
		setSpinBehavior1P(new SpinBlock3x3());
		setTopLeftPoint1P(new Point(1, 4));
		tempTopLeftPoint1P = new Point(2, 4);
		color = new Color(220, 0, 255);
		coord1P = new Point[] { new Point(1, 0), new Point(0, -1), new Point(0, 0), new Point(0, 1), new Point(0, 2) };
		tempCoord1P = new Point[] { new Point(1, 0), new Point(0, -1), new Point(0, 0), new Point(0, 1), new Point(0, 2) };
	}

	public void initShape2P() {
		setSpinBehavior2P(new SpinBlock3x3());
		setTopLeftPoint2P(new Point(1, 4));
		tempTopLeftPoint2P = new Point(2, 4);
		color = new Color(220, 0, 255);
		coord2P = new Point[] { new Point(1, 0), new Point(0, -1), new Point(0, 0), new Point(0, 1), new Point(0, 2) };
		tempCoord2P = new Point[] { new Point(1, 0), new Point(0, -1), new Point(0, 0), new Point(0, 1), new Point(0, 2) };
	}

	public void initShapeSolo() {
		setSpinBehaviorSolo(new SpinBlock3x3());
		setTopLeftPointSolo(new Point(1, 4));
		tempTopLeftPointSolo = new Point(2, 4);
		color = new Color(220, 0, 255);
		coordSolo = new Point[] { new Point(1, 0), new Point(0, -1), new Point(0, 0), new Point(0, 1), new Point(0, 2) };
		tempCoordSolo = new Point[] { new Point(1, 0), new Point(0, -1), new Point(0, 0), new Point(0, 1), new Point(0, 2) };
	}

	/** 블럭의 위치를 바꿉니다. */
	@Override
	public void changeCoord1P() {
		gameBoard1P.changePoint(topLeftPoint1P.setCurrentPoint1P(coord1P[0]), 8);
		gameBoard1P.changePoint(topLeftPoint1P.setCurrentPoint1P(coord1P[1]), 8);
		gameBoard1P.changePoint(topLeftPoint1P.setCurrentPoint1P(coord1P[2]), 8);
		gameBoard1P.changePoint(topLeftPoint1P.setCurrentPoint1P(coord1P[3]), 8);
		gameBoard1P.changePoint(topLeftPoint1P.setCurrentPoint1P(coord1P[4]), 8);
		
	}

	public void changeCoord2P() {
		gameBoard2P.changePoint(topLeftPoint2P.setCurrentPoint2P(coord2P[0]), 8);
		gameBoard2P.changePoint(topLeftPoint2P.setCurrentPoint2P(coord2P[1]), 8);
		gameBoard2P.changePoint(topLeftPoint2P.setCurrentPoint2P(coord2P[2]), 8);
		gameBoard2P.changePoint(topLeftPoint2P.setCurrentPoint2P(coord2P[3]), 8);
		gameBoard2P.changePoint(topLeftPoint2P.setCurrentPoint2P(coord2P[4]), 8);
	}
	public void changeCoordSolo() {
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[0]), 8);
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[1]), 8);
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[2]), 8);
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[3]), 8);
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[4]), 8);
	}

}
