import './App.css';
import React, { useState } from 'react';
import { Route, Routes } from 'react-router-dom';
import styled, { ThemeProvider } from 'styled-components';
import { theme } from 'styles/theme';

import GameMainPageLayout from 'layouts/GamePageLayout';

import MainPage from 'pages/main/MainPage';
import GameMainPage from 'pages/game/GameMainPage';
import ShopPage from 'pages/game/ShopPage';

function App() {
  return (
    <ThemeProvider theme={theme}>
      <Routes>
        <Route path="/" element={<MainPage />} />
        <Route path="/game" element={<GameMainPageLayout />}>
          <Route path="start" element={<GameMainPage />} />
          <Route path="shop" element={<ShopPage />} />
        </Route>
      </Routes>
    </ThemeProvider>
  );
}

export default App;