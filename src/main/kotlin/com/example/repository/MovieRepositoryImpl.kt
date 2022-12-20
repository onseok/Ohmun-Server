package com.example.repository

import com.example.model.Actor
import com.example.model.Movie
import com.example.model.MovieResponse



class MovieRepositoryImpl : MovieRepository {

    override val movies: Map<Int, List<Movie>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1 = listOf(
        Movie(
            id = 1,
            title = "재벌집 막내아들",
            image = "/movies/reborn_rich.jpg",
            openingDate = "2022",
            genre = listOf(
                "드라마",
                "판타지",
                "복수",
                "환생",
                "회귀",
                "가족",
                "오피스",
                "정치",
                "스릴러",
                "로맨스",
                "시대극"
            ),
            platform = listOf(
                "tving",
                "netflix",
                "disney_plus"
            ),
            actors = listOf(
                Actor(
                    id = 1,
                    name = "송중기",
                    image = "/actors/song_joong_ki.jpg",
                    age = 37,
                    birthDate = "1985년 9월 19일"
                ),
                Actor(
                    id = 2,
                    name = "이성민",
                    image = "/actors/lee_sung_min.jpg",
                    age = 54,
                    birthDate = "1968년 12월 4일"
                ),
                Actor(
                    id = 3,
                    name = "신현빈",
                    image = "/actors/shin_hyun_been.jpg",
                    age = 36,
                    birthDate = "1986년 4월 10일"
                )
            ),
            reviews = listOf(

            )
        ),
        Movie(
            id = 2,
            title = "웬즈데이",
            image = "/movies/wednesday.jpg",
            openingDate = "2022",
            genre = listOf(
                "미스터리",
                "범죄",
                "판타지",
                "청소년",
                "코미디"
            ),
            platform = listOf(
                "netflix"
            ),
            actors = listOf(
                Actor(
                    id = 4,
                    name = "제나 오르테가",
                    image = "/actors/jenna_ortega.jpg",
                    age = 20,
                    birthDate = "2002년 9월 27일"
                ),
                Actor(
                    id = 5,
                    name = "그웬돌린 크리스티",
                    image = "/actors/gwendoline_christie.jpg",
                    age = 44,
                    birthDate = "1978년 10월 28일"
                ),
                Actor(
                    id = 6,
                    name = "헌터 두한",
                    image = "/actors/hunter_doohan.jpg",
                    age = 28,
                    birthDate = "1994년 1월 19일"
                )
            ),
            reviews = listOf(

            )
        ),
        Movie(
            id = 3,
            title = "그 해 우리는",
            image = "/movies/our_beloved_summer.jpg",
            openingDate = "2021",
            genre = listOf(
                "로맨틱",
                "코미디",
                "청춘",
                "성장물",
                "힐링"
            ),
            platform = listOf(
                "wavve",
                "netflix"
            ),
            actors = listOf(
                Actor(
                    id = 7,
                    name = "최우식",
                    image = "/actors/choi_woo_shik.jpg",
                    age = 32,
                    birthDate = "1990년 3월 26일"
                ),
                Actor(
                    id = 8,
                    name = "김다미",
                    image = "/actors/kim_da_mi.jpg",
                    age = 27,
                    birthDate = "1995년 4월 9일"
                ),
                Actor(
                    id = 9,
                    name = "김성철",
                    image = "/actors/kim_sung_cheol.jpg",
                    age = 30,
                    birthDate = "1991년 12월 31일"
                )
            ),
            reviews = listOf(

            )
        )
    )

    override val page2 = listOf(
        Movie(
            id = 4,
            title = "동백꽃 필 무렵",
            image = "/movies/when_the_camellia_blooms.jpg",
            openingDate = "2019",
            genre = listOf(
                "로맨스",
                "스릴러",
                "힐링",
                "휴먼"
            ),
            platform = listOf(
                "kbs_2tv",
                "netflix",
                "watcha"
            ),
            actors = listOf(
                Actor(
                    id = 10,
                    name = "공효진",
                    image = "/actors/kong_hyo_jin.jpg",
                    age = 42,
                    birthDate = "1980년 4월 4일"
                ),
                Actor(
                    id = 11,
                    name = "강하늘",
                    image = "/actors/kang_ha_neul.jpg",
                    age = 32,
                    birthDate = "1990년 2월 21일"
                ),
                Actor(
                    id = 12,
                    name = "김지석",
                    image = "/actors/kim_ji_seok.jpg",
                    age = 41,
                    birthDate = "1981년 4월 21일"
                )
            ),
            reviews = listOf(

            )
        ),
        Movie(
            id = 5,
            title = "부부의 세계",
            image = "/movies/the_world_of_the_married.jpg",
            openingDate = "2020",
            genre = listOf(
                "드라마",
                "멜로",
                "복수",
                "막장 드라마"
            ),
            platform = listOf(
                "tving",
                "watcha",
                "netflix"
            ),
            actors = listOf(
                Actor(
                    id = 13,
                    name = "김희애",
                    image = "/actors/kim_hee_ae.jpg",
                    age = 55,
                    birthDate = "1967년 4월 23일"
                ),
                Actor(
                    id = 14,
                    name = "박해준",
                    image = "/actors/park_hae_jun.jpg",
                    age = 46,
                    birthDate = "1976년 6월 14일"
                ),
                Actor(
                    id = 15,
                    name = "한소희",
                    image = "/actors/han_so_hee.jpg",
                    age = 28,
                    birthDate = "1994년 11월 18일"
                )
            ),
            reviews = listOf(

            )
        ),
        Movie(
            id = 6,
            title = "수리남",
            image = "/movies/narco_saints.jpg",
            openingDate = "2022",
            genre = listOf(
                "범죄",
                "스릴러",
                "액션",
                "느와르",
                "드라마",
                "첩보",
                "시대극"
            ),
            platform = listOf(
                "netflix"
            ),
            actors = listOf(
                Actor(
                    id = 16,
                    name = "하정우",
                    image = "/actors/ha_jung_woo.jpg",
                    age = 44,
                    birthDate = "1978년 3월 11일"
                ),
                Actor(
                    id = 17,
                    name = "황정민",
                    image = "/actors/hwang_jung_min.jpg",
                    age = 52,
                    birthDate = "1970년 9월 1일"
                ),
                Actor(
                    id = 18,
                    name = "박해수",
                    image = "/actors/park_hae_soo.jpg",
                    age = 41,
                    birthDate = "1981년 11월 21일"
                ),
                Actor(
                    id = 19,
                    name = "조우진",
                    image = "/actors/jo_woo_jin.jpg",
                    age = 43,
                    birthDate = "1979년 1월 16일"
                ),
                Actor(
                    id = 20,
                    name = "유연석",
                    image = "/actors/yoo_yeon_seok.jpg",
                    age = 38,
                    birthDate = "1984년 4월 11일"
                )
            ),
            reviews = listOf(

            )
        )
    )

    override val page3 = listOf(
        Movie(
            id = 7,
            title = "오징어 게임",
            image = "/movies/squid_game.jpg",
            openingDate = "2021",
            genre = listOf(
                "데스 게임",
                "서바이벌",
                "스릴러",
                "액션",
                "드라마",
                "피카레스크"
            ),
            platform = listOf(
                "netflix"
            ),
            actors = listOf(
                Actor(
                    id = 21,
                    name = "이정재",
                    image = "/actors/lee_jung_jae.jpg",
                    age = 50,
                    birthDate = "1972년 12월 15일"
                ),
                Actor(
                    id = 18,
                    name = "박해수",
                    image = "/actors/park_hae_soo.jpg",
                    age = 41,
                    birthDate = "1981년 11월 21일"
                ),
                Actor(
                    id = 22,
                    name = "위하준",
                    image = "/actors/wi_ha_jun.jpg",
                    age = 31,
                    birthDate = "1991년 8월 5일"
                ),
                Actor(
                    id = 23,
                    name = "오영수",
                    image = "/actors/oh_yeong_su.jpg",
                    age = 78,
                    birthDate = "1944년 10월 19일"
                ),
                Actor(
                    id = 24,
                    name = "정호연",
                    image = "/actors/jung_ho_yeon.jpg",
                    age = 28,
                    birthDate = "1994년 6월 23일"
                ),
                Actor(
                    id = 25,
                    name = "허성태",
                    image = "/actors/heo_sung_tae.jpg",
                    age = 45,
                    birthDate = "1977년 10월 20일"
                ),
                Actor(
                    id = 26,
                    name = "김주령",
                    image = "/actors/kim_joo_ryeong.jpg",
                    age = 46,
                    birthDate = "1976년 7월 15일"
                ),
                Actor(
                    id = 27,
                    name = "아누팜 트리파티",
                    image = "/actors/anupam_tripathi.jpg",
                    age = 34,
                    birthDate = "1988년 11월 2일"
                )
            ),
            reviews = listOf(

            )
        ),
        Movie(
            id = 8,
            title = "인터스텔라",
            image = "/movies/inter_stellar.jpg",
            openingDate = "2013",
            genre = listOf(
                "SF",
                "드라마",
                "어드벤처",
                "액션",
                "디스토피아"
            ),
            platform = listOf(
                "netflix",
                "watcha",
                "tving",
                "wavve",
                "kakao_page",
                "series_on"
            ),
            actors = listOf(
                Actor(
                    id = 28,
                    name = "매튜 매커너히",
                    image = "/actors/matthew_mc_conaughey.jpg",
                    age = 53,
                    birthDate = "1969년 11월 4일"
                ),
                Actor(
                    id = 29,
                    name = "앤 해서웨이",
                    image = "/actors/anne_hathaway.jpg",
                    age = 40,
                    birthDate = "1982년 11월 12일"
                ),
                Actor(
                    id = 30,
                    name = "제시카 차스테인",
                    image = "/actors/jessica_chastain.jpg",
                    age = 45,
                    birthDate = "1977년 3월 24일"
                )
            ),
            reviews = listOf(

            )
        ),
        Movie(
            id = 9,
            title = "퀸즈 갬빗",
            image = "/movies/the_queen's_gambit.jpg",
            openingDate = "2020",
            genre = listOf(
                "드라마"
            ),
            platform = listOf(
                "netflix"
            ),
            actors = listOf(
                Actor(
                    id = 31,
                    name = "안야 테일러조이",
                    image = "/actors/anya_taylor_joy.jpg",
                    age = 26,
                    birthDate = "1996년 4월 16일"
                ),
                Actor(
                    id = 32,
                    name = "토머스 브로디생스터",
                    image = "/actors/thomas_brodie_sangster.jpg",
                    age = 32,
                    birthDate = "1990년 5월 16일"
                )
            ),
            reviews = listOf(

            )
        )
    )

    override val page4 = listOf(
        Movie(
            id = 10,
            title = "알고 있지만,",
            image = "/movies/nevertheless.jpg",
            openingDate = "2020",
            genre = listOf(
                "드라마"
            ),
            platform = listOf(
                "tving",
                "netflix"
            ),
            actors = listOf(
                Actor(
                    id = 15,
                    name = "한소희",
                    image = "/actors/han_so_hee.jpg",
                    age = 28,
                    birthDate = "1994년 11월 18일"
                ),
                Actor(
                    id = 33,
                    name = "송강",
                    image = "/actors/song_kang.jpg",
                    age = 28,
                    birthDate = "1994년 4월 23일"
                )
            ),
            reviews = listOf(

            )
        ),
        Movie(
            id = 11,
            title = "슬기로운 의사생활",
            image = "/movies/hospital_playlist.jpg",
            openingDate = "2020",
            genre = listOf(
                "드라마",
                "의학",
                "휴먼",
                "코미디",
                "음악"
            ),
            platform = listOf(
                "tving",
                "netflix"
            ),
            actors = listOf(
                Actor(
                    id = 34,
                    name = "조정석",
                    image = "/actors/cho_jung_seok.jpg",
                    age = 41,
                    birthDate = "1980년 12월 26일"
                ),
                Actor(
                    id = 35,
                    name = "김대명",
                    image = "/actors/kim_dae_myeung.jpg",
                    age = 41,
                    birthDate = "1981년 2월 16일"
                ),
                Actor(
                    id = 36,
                    name = "전미도",
                    image = "/actors/jeon_mi_do.jpg",
                    age = 40,
                    birthDate = "1982년 8월 4일"
                ),
                Actor(
                    id = 37,
                    name = "정경호",
                    image = "/actors/jung_kyung_ho.jpg",
                    age = 39,
                    birthDate = "1983년 8월 31일"
                ),
                Actor(
                    id = 20,
                    name = "유연석",
                    image = "/actors/yoo_yeon_seok.jpg",
                    age = 38,
                    birthDate = "1984년 4월 11일"
                )
            ),
            reviews = listOf(

            )
        ),
        Movie(
            id = 12,
            title = "D.P.",
            image = "/movies/dp.jpg",
            openingDate = "2020",
            genre = listOf(
                "드라마",
                "밀리터리",
                "미스터리"
            ),
            platform = listOf(
                "netflix"
            ),
            actors = listOf(
                Actor(
                    id = 38,
                    name = "정해인",
                    image = "/actors/jung_hae_in.jpg",
                    age = 34,
                    birthDate = "1988년 4월 1일"
                ),
                Actor(
                    id = 39,
                    name = "구교환",
                    image = "/actors/koo_kyo_hwan.jpg",
                    age = 40,
                    birthDate = "1982년 12월 14일"
                ),
                Actor(
                    id = 40,
                    name = "김성균",
                    image = "/actors/kim_sung_kyun.jpg",
                    age = 42,
                    birthDate = "1980년 7월 5일"
                ),
                Actor(
                    id = 41,
                    name = "손석구",
                    image = "/actors/son_suk_ku.jpg",
                    age = 39,
                    birthDate = "1983년 2월 7일"
                )
            ),
            reviews = listOf(

            )
        )
    )


    override val page5 = listOf(
        Movie(
            id = 13,
            title = "인간수업",
            image = "/movies/extra_curricular.jpg",
            openingDate = "2020",
            genre = listOf(
                "범죄",
                "스릴러",
                "하이틴",
                "드라마"
            ),
            platform = listOf(
                "netflix"
            ),
            actors = listOf(
                Actor(
                    id = 42,
                    name = "김동희",
                    image = "/actors/kim_dong_hee.jpg",
                    age = 23,
                    birthDate = "1999년 6월 13일"
                ),
                Actor(
                    id = 43,
                    name = "박주현",
                    image = "/actors/park_ju_hyun.jpg",
                    age = 28,
                    birthDate = "1994년 10월 5일"
                ),
                Actor(
                    id = 44,
                    name = "정다빈",
                    image = "/actors/jung_da_bin.jpg",
                    age = 22,
                    birthDate = "2000년 4월 25일"
                ),
                Actor(
                    id = 45,
                    name = "남윤수",
                    image = "/actors/nam_yoon_su.jpg",
                    age = 25,
                    birthDate = "1997년 7월 14일"
                ),
            ),
            reviews = listOf(

            )
        ),
        Movie(
            id = 14,
            title = "슈룹",
            image = "/movies/under_the_queen's_umbrella.jpg",
            openingDate = "2022",
            genre = listOf(
                "드라마",
                "가상역사",
                "블랙 코미디",
                "복수",
                "피카레스크"
            ),
            platform = listOf(
                "tving",
                "netflix"
            ),
            actors = listOf(
                Actor(
                    id = 46,
                    name = "김혜수",
                    image = "/actors/kim_hye_soo.jpg",
                    age = 52,
                    birthDate = "1970년 9월 5일"
                ),
                Actor(
                    id = 47,
                    name = "김해숙",
                    image = "/actors/kim_hae_sook.jpg",
                    age = 66,
                    birthDate = "1955년 12월 30일"
                ),
                Actor(
                    id = 48,
                    name = "최원영",
                    image = "/actors/choi_won_young.jpg",
                    age = 46,
                    birthDate = "1976년 1월 10일"
                )
            ),
            reviews = listOf(

            )
        ),
        Movie(
            id = 15,
            title = "20세기 소녀",
            image = "/movies/20th_century_girl.jpg",
            openingDate = "2021",
            genre = listOf(
                "드라마",
                "청춘",
                "로맨스",
                "시대극"
            ),
            platform = listOf(
                "netflix"
            ),
            actors = listOf(
                Actor(
                    id = 49,
                    name = "김유정",
                    image = "/actors/kim_you_jung.jpg",
                    age = 23,
                    birthDate = "1999년 9월 22일"
                ),
                Actor(
                    id = 50,
                    name = "변우석",
                    image = "/actors/byeon_woo_seok.jpg",
                    age = 31,
                    birthDate = "1991년 10월 31일"
                ),
                Actor(
                    id = 51,
                    name = "박정우",
                    image = "/actors/park_jung_woo.jpg",
                    age = 26,
                    birthDate = "1996년 1월 19일"
                ),
                Actor(
                    id = 52,
                    name = "노윤서",
                    image = "/actors/roh_yoon_seo.jpg",
                    age = 22,
                    birthDate = "2000년 1월 25일"
                )
            ),
            reviews = listOf(

            )
        )
    )


    override suspend fun getAllMovies(page: Int): MovieResponse {
        return MovieResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            movies = movies[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }
        return mapOf(PREVIOUS_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchMovies(name: String?): MovieResponse {
        return MovieResponse(
            success = true,
            message = "ok",
            movies = findMovies(query = name)
        )
    }

    private fun findMovies(query: String?): List<Movie> {
        val founded = mutableListOf<Movie>()
        return if (!query.isNullOrEmpty()) {
            movies.forEach { (_, movies) ->
                movies.forEach { movie ->
                    if (movie.title.lowercase().contains(query.lowercase())) {
                        founded.add(movie)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }

    companion object {
        const val NEXT_PAGE_KEY = "nextPage"
        const val PREVIOUS_PAGE_KEY = "prevPage"
    }

}