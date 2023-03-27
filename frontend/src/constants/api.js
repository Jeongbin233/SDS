const api = function (type, options = {}) {
  const apiObject = {
    // 사용자 인증 (카카오)
    login: ['/api/users', 'get'],

    // 게임 메인 페이지
    getRandomCh: ['/character/random/1', 'get'],
    getSelectedCh: ['/character/selected/1', 'get'], // 전투 승리했을 때 한 번 더 불러와야함 (스텟 찍기 전에)
    saveCh: ['/character/save', 'post'],

    // 맵 페이지
    loadMap: ['/map/load', 'get'],
    selectMap: ['/api/map/save', 'put'],
    saveStage: ['/api/stage/save', 'put'],

    // 전투 페이지
    loadStage: ['/stage/load', 'get'],
    enemysTurn: ['/battle/enemy/1', 'put'],
    playersTurn: ['/battle/player/1', 'post'],
    finishTurn: ['/api/battle/finished', 'put'],

    // 캐릭터 사망으로 전투 종료
    endBattle: ['/battle/end', 'delete'],

    // 전투 승리 후 스텟 창
    changeStat: ['/api/battle/victory', 'put'],

    // 상점
    changeCh: ['/api/shop/change', 'put'],
    addCh: ['/api/shop/add', 'post'],
    rest: ['/api/shop/rest', 'put'],
    addItem: ['/api/shop/relic', 'post'],

    // 랭킹
    ranking: ['/api/result/ranking', 'get'],

    // 전투 승리 or 패배
    gameOver: ['/api/result/gameOver', 'get'],
    clearPut: ['/api/result/clear', 'put'],
    clearDelete: ['/api/result/clear', 'delete'],
  };

  return apiObject[type];
};

export default api;