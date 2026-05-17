package ch06.sec07.exam02;

public class Earth {
	// 지구 반지름 상수 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	
	// 지구 표면적 상수 선언
	// 💡 수정: 오타를 교정하여 변수명을 정확히 선언했습니다 (SURFCE -> SURFACE)
	static final double EARTH_SURFACE_AREA;
	
	// 정적 초기화 블록 (복잡한 공식으로 상수를 초기화할 때 사용)
	static {
		// 💡 수정: 선언부와 동일한 올바른 상스명으로 값을 대입합니다 (EATH -> EARTH)
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}

	// 💡 추가: 변수가 잘 작동하는지 확인하기 위한 실행 공간
	public static void main(String[] args) {
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + " km");
		System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + " km²");
	}
}