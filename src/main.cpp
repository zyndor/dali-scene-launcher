/*
 * Copyright (c) 2020 Samsung Electronics Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
#include "scene-launcher.h"

#include "dali-toolkit/dali-toolkit.h"
#include "dali/dali.h"

using namespace Dali;
using namespace Dali::Toolkit;
using namespace dli;

const char* const SCENE_NAME = "robot";

int main(int argc, char** argv)
{
  auto app = Application::New(&argc, &argv);
  SceneLauncher launcher(app, argc > 1 ? argv[1] : SCENE_NAME);
  app.MainLoop();
  return 0;
}