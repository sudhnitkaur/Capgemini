package Question10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Square implements ApplicationContextAware, BeanNameAware  {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	@SuppressWarnings("unused")
	private Point pointD;
	private ApplicationContext context = null;


	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public Point getPointD() {
		return pointA;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}
	public void draw(){
		System.out.println("Point A : " + getPointA().getX()+ ", "+getPointA().getY());
		System.out.println("Point B : " + getPointB().getX()+ ", "+getPointB().getY());
		System.out.println("Point C : " + getPointC().getX()+ ", "+getPointC().getY());
		System.out.println("Point D : " + getPointD().getX()+ ", "+getPointD().getY());
	}


	public void setBeanName(String name) {
		System.out.println("Bean name is : "+ name);
	}


	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
		System.out.println(applicationContext);
		
	}

}

