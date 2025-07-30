package com.safe.setting.app.di.module;

import com.safe.setting.app.ui.activities.register.InteractorRegister;
import com.safe.setting.app.ui.activities.register.InterfaceInteractorRegister;
import com.safe.setting.app.ui.activities.register.InterfaceViewRegister;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.safe.setting.app.di.PerActivity")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class ActivityModule_ProvideInterfaceInteractorRegisterFactory implements Factory<InterfaceInteractorRegister<InterfaceViewRegister>> {
  private final ActivityModule module;

  private final Provider<InteractorRegister<InterfaceViewRegister>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorRegisterFactory(ActivityModule module,
      Provider<InteractorRegister<InterfaceViewRegister>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorRegister<InterfaceViewRegister> get() {
    return provideInterfaceInteractorRegister(module, interactorProvider.get());
  }

  public static ActivityModule_ProvideInterfaceInteractorRegisterFactory create(
      ActivityModule module,
      Provider<InteractorRegister<InterfaceViewRegister>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorRegisterFactory(module, interactorProvider);
  }

  public static InterfaceInteractorRegister<InterfaceViewRegister> provideInterfaceInteractorRegister(
      ActivityModule instance, InteractorRegister<InterfaceViewRegister> interactor) {
    return Preconditions.checkNotNullFromProvides(instance.provideInterfaceInteractorRegister(interactor));
  }
}
