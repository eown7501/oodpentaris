package model;

import java.awt.Color;

/**
 * 이 BlockI 클래스는 Block을 상속하고 있으며, I Block을 구현한 Class 입니다.
 * 
 * @author 곽소정
 *
 */
public class BlockL extends Block {

	/**
	 * GameBoard 위에 I Block을 생성합니다.
	 * 
	 * @param gameBoard
	 *            - Block이 생성될 GameBoard 입니다.
	 */
	public BlockL(GameBoard gameBoard) {
		super(gameBoard);
		initShape();
		initShape2();

	}
	
	public BlockL(GameBoardSolo gameBoardSolo) {
		super(gameBoardSolo);
		initShapeSolo();
	}

	/** Block 의 모양을 결정합니다. */
	@Override
	public void initShape() {
		setSpinBehavior(new SpinBlock3x3());
		setTopLeftPoint(new Point(1, 4));
		tempTopLeftPoint = new Point(2, 4);
		color = new Color(36, 244, 0);
		coord = new Point[] { new Point(-1, 1), new Point(0, -1), new Point(0, 0), new Point(0, 1) };
		tempCoord = new Point[] { new Point(-1, 1), new Point(0, -1), new Point(0, 0), new Point(0, 1) };
	}
	public void initShape2() {
		setSpinBehavior2(new SpinBlock3x3());
		setTopLeftPoint2(new Point(1, 4));
		tempTopLeftPoint2 = new Point(2, 4);
		color = new Color(36, 244, 0);
		coord2 = new Point[] { new Point(-1, 1), new Point(0, -1), new Point(0, 0), new Point(0, 1) };
		tempCoord2 = new Point[] { new Point(-1, 1), new Point(0, -1), new Point(0, 0), new Point(0, 1) };
	}
	public void initShapeSolo() {
		setSpinBehaviorSolo(new SpinBlock3x3());
		setTopLeftPointSolo(new Point(1, 4));
		tempTopLeftPointSolo = new Point(2, 4);
		color = new Color(36, 244, 0);
		coordSolo = new Point[] { new Point(-1, 1), new Point(0, -1), new Point(0, 0), new Point(0, 1) };
		tempCoordSolo = new Point[] { new Point(-1, 1), new Point(0, -1), new Point(0, 0), new Point(0, 1) };
	}

	/** 블럭의 위치를 바꿉니다. */
	@Override
	public void changeCoord() {
		gameBoard.changePoint(topLeftPoint.setCurrentPoint(coord[0]), 3);
		gameBoard.changePoint(topLeftPoint.setCurrentPoint(coord[1]), 3);
		gameBoard.changePoint(topLeftPoint.setCurrentPoint(coord[2]), 3);
		gameBoard.changePoint(topLeftPoint.setCurrentPoint(coord[3]), 3);
	}
	public void changeCoord2() {
		gameBoard.changePoint2(topLeftPoint2.setCurrentPoint2(coord2[0]), 3);
		gameBoard.changePoint2(topLeftPoint2.setCurrentPoint2(coord2[1]), 3);
		gameBoard.changePoint2(topLeftPoint2.setCurrentPoint2(coord2[2]), 3);
		gameBoard.changePoint2(topLeftPoint2.setCurrentPoint2(coord2[3]), 3);
	}

	public void changeCoordSolo() {
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[0]), 3);
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[1]), 3);
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[2]), 3);
		gameBoardSolo.changePointSolo(topLeftPointSolo.setCurrentPointSolo(coordSolo[3]), 3);
	}

}
