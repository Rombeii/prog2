 #
 # @brief Benchmarking Cognitive Abilities of the Brain with Computer Games
 #
 # @file BrainB.pro
 # @author  Norbert Bátfai <nbatfai@gmail.com>
 # @version 0.0.1
 #
 # @section LICENSE
 #
 # Copyright (C) 2017 Norbert Bátfai, nbatfai@gmail.com
 #
 # This program is free software: you can redistribute it and/or modify
 # it under the terms of the GNU General Public License as published by
 # the Free Software Foundation, either version 3 of the License, or
 # (at your option) any later version.
 #
 # This program is distributed in the hope that it will be useful,
 # but WITHOUT ANY WARRANTY; without even the implied warranty of
 # MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 # GNU General Public License for more details.
 #
 # You should have received a copy of the GNU General Public License
 # along with this program.  If not, see <http://www.gnu.org/licenses/>.
 #
 # @section DESCRIPTION
 #
 #
 
QT += widgets core
CONFIG += c++11 c++14 c++17
QMAKE_CXXFLAGS += -fopenmp
LIBS += -fopenmp 
LIBS += `pkg-config --libs opencv`

TEMPLATE = app
TARGET = BrainB
INCLUDEPATH +=/usr/local/include/opencv4/opencv2

HEADERS += BrainBThread.h  BrainBWin.h
    #../../../../../../../usr/local/include/opencv4/opencv2/opencv.hpp
    /opt/include/opencv2/opencv.hpp
SOURCES += BrainBThread.cpp  BrainBWin.cpp  main.cpp

QT_CONFIG -= no-pkg-config
unix: CONFIG += link_pkgconfig
unix: PKGCONFIG += opencv

unix:!macx: LIBS += -L$$PWD/../../../../../../../usr/local/lib/ -lopencv_xphoto

INCLUDEPATH += $$PWD/../../../../../../../opt/opencv/include
DEPENDPATH += $$PWD/../../../../../../../opt/opencv/include

win32:CONFIG(release, debug|release): LIBS += -L$$PWD/../../../../../../../usr/local/lib/release/ -lopencv_core
else:win32:CONFIG(debug, debug|release): LIBS += -L$$PWD/../../../../../../../usr/local/lib/debug/ -lopencv_core
else:unix: LIBS += -L$$PWD/../../../../../../../usr/local/lib/ -lopencv_core

INCLUDEPATH += $$PWD/../../../../../../../usr/local/include
DEPENDPATH += $$PWD/../../../../../../../usr/local/include

unix:!macx: LIBS += -L$$PWD/../../../../../../../usr/local/lib/ -lopencv_core

INCLUDEPATH += $$PWD/../../../../../../../opt/opencv/include/opencv2
DEPENDPATH += $$PWD/../../../../../../../opt/opencv/include/opencv2

unix:!macx: LIBS += -L$$PWD/../../../../../../../usr/local/lib/ -lopencv_core

INCLUDEPATH += $$PWD/../../../../../../../usr/local/include
DEPENDPATH += $$PWD/../../../../../../../usr/local/include
