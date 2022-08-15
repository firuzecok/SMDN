Feature:  test api

    @RoomGet
    Scenario: Room api with Get request Room api testi

        Given kullanici roomlar icin get request yapar
        And kullanici gelen room datayi deserialize eder
        Then kullanici room datasini validate eder


        @RoomPost
        Scenario: post request validation
            Given kullanici roomlar icin post request yapar
            Then kullanıcı post request validation yapar


       Scenario: put request validation
           Given kullanici roomlar icin put request yapar
           Then kullanıcı put request validation yapar
           Then kullanıcı post request validation yapar


