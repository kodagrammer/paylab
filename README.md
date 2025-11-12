# PayLab

**PayLab**은 개인 연습용으로 구현하는 실무형 결제 모듈 프로젝트입니다.  
Fintech 결제 서비스의 핵심 로직을 테스트하고, 멀티모듈 구조와 Spring Boot, Gradle, Kafka/Redis, JWT 등 실무 기술을 경험하는 것이 목적입니다.

---

## 🚀 프로젝트 목표

1. **결제 모듈 구현**
    - PG 결제/취소 요청
    - 오류 발생 시 재시도 및 상태 관리
    - 중복 결제 방지

2. **비동기 메시징/트래픽 관리**
    - Kafka로 결제 이벤트 전송
    - Redis로 세션/상태 캐싱

3. **보안 및 인증**
    - PG 키, 비밀 정보 암호화 및 KMS 사용
    - JWT 기반 인증 및 권한 관리

4. **문서화**
    - Spring REST Docs로 API 문서 자동 생성

---

## 💻 기술 스택

- **Backend**: Java 21, Spring Boot 3, JPA
- **Database**: MySQL
- **Message / Cache**: Kafka, Redis
- **문서화**: Spring REST Docs
- **빌드/프로젝트 관리**: Gradle (멀티모듈)
- **보안**: KMS 기반 비밀 관리, JWT 인증
- **컨테이너**: Docker (로컬 개발환경)

---

## 🏗 프로젝트 구조
```
paylab
├── paylab-api       # Spring Boot API 모듈
│   ├── src
│   └── build.gradle
├── paylab-core      # 비즈니스 로직 / JPA 엔티티
│   ├── src
│   └── build.gradle
├── paylab-common    # 공통 유틸, 예외, DTO
│   ├── src
│   └── build.gradle
├── build.gradle     # 루트 공통 설정
├── settings.gradle  # 모듈 include
└── gradle
```